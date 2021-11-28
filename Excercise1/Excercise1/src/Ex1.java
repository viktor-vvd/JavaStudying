public class Ex1 {
    public static void main(String[] args) throws Exception {
        String text = "abcv J4f4J . sdfv aaa 9876789";
        int pal = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            word = word.trim();
            if (word.length() > 1) {
                int count = 0;
                for (int i = 0; i < word.length() / 2; i++) {
                    if (word.toCharArray()[i] == word.toCharArray()[word.length() - 1 - i]) {
                        count++;
                    }
                }
                if (count == word.length() / 2) {
                    pal++;
                }
            }
        }
        System.out.println(pal);
    }
}
