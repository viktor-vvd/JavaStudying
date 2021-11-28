public class Ex2 {
    public static void main(String[] args) throws Exception {
        String[] text = { "flower", "flow", "flight" };
        String prefix = "";
        Boolean stop = false;
        while (!stop) {
            for (String str : text) {
                if (!str.startsWith(prefix)) {
                    stop = true;
                    prefix = prefix.substring(0, prefix.length() - 1);
                    break;
                }
            }
            if (!stop)
                prefix = text[0].substring(0, prefix.length() + 1);
        }
        System.out.println(prefix);
    }
}
