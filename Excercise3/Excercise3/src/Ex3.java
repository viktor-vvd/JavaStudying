public class Ex3 {
    public static void main(String[] args) throws Exception {
        String[][] board = { { "5", "3", ".", ".", "7", ".", ".", ".", "." },
                { "6", ".", ".", "1", "9", "5", ".", ".", "." }, { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                { "8", ".", ".", ".", "6", ".", ".", ".", "3" }, { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                { "7", ".", ".", ".", "2", ".", ".", ".", "6" }, { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                { ".", ".", ".", "4", "1", "9", ".", ".", "5" }, { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };
        String[] squares = { "", "", "", "", "", "", "", "", "" };
        boolean isValid = true;
        for (int i = 0; i < board.length && isValid; i++) {
            for (int j = 0; j < board[0].length && isValid; j++) {
                if (board[i][j] != ".") {
                    for (int u = 0; u < board[0].length && isValid; u++) {
                        if (board[i][j] == board[i][u] && j != u && isValid) {
                            isValid = false;
                        }
                        if (board[i][j] == board[u][j] && i != u && isValid) {
                            isValid = false;
                        }
                    }
                    if (i < 3 && j < 3) {
                        squares[0] += board[i][j];
                    } else if (i < 3 && j >= 3 && j < 6) {
                        squares[1] += board[i][j];
                    } else if (i < 3 && j >= 6 && j < 9) {
                        squares[2] += board[i][j];
                    }

                    else if (i >= 3 && i < 6 && j < 3) {
                        squares[3] += board[i][j];
                    } else if (i >= 3 && i < 6 && j >= 3 && j < 6) {
                        squares[4] += board[i][j];
                    } else if (i >= 3 && i < 6 && j >= 6 && j < 9) {
                        squares[5] += board[i][j];
                    }

                    else if (i >= 6 && i < 9 && j < 3) {
                        squares[6] += board[i][j];
                    } else if (i >= 6 && i < 9 && j >= 3 && j < 6) {
                        squares[7] += board[i][j];
                    } else if (i >= 6 && i < 9 && j >= 6 && j < 9) {
                        squares[8] += board[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < squares.length && isValid; i++) {
            for (int j = 0; j < squares[i].length() && isValid; j++) {
                for (int u = 0; u < squares[i].length() && isValid; u++) {
                    if (squares[i].toCharArray()[j] == squares[i].toCharArray()[u] && j != u && isValid) {
                        isValid = false;
                    }
                }
            }
        }
        System.out.println(isValid);
    }
}