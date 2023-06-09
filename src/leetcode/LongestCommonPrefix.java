package leetcode;

public class LongestCommonPrefix {
    private static String longestCommonPrefix(String [] sentence) {
        String index = "";
        for (int i = 0; i < sentence.length; i++) {
            for (int c = 1; c < sentence.length; c++) {
                String match = sentence[i].substring(0, 2);
                if (sentence[i].matches(match) && sentence[c].matches(match)) {
                    index += match;
                }

            }
                System.out.println(index);
        }
            return "prefix not found ";
    }
    public static void main(String[] args) {
        String [] colors = {"red","read","green ","ready"};
        System.out.println(longestCommonPrefix(colors));
    }
}
