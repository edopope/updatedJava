package leetcode;

public class LongestPalindrome {
    public static  void longestPalindrome(String [] sentences) {
        int longest = 0;
        for (int i = 0; i < sentences.length ; i++) {
            StringBuilder builder = new StringBuilder(sentences[i]);
            builder.reverse();
            String reversed = builder.toString();
            if (reversed.equals(sentences[i]) && sentences[i].length() > longest) {
                longest = sentences[i].length();
                System.out.println("palindrome"+  longest + sentences[i]);
            }
            else {
                System.out.println("not palindrome");
            }
        }



    }

    public static void main(String[] args) {
        String[] name = {"shit","mum","madam","glory","godwin","Aa"};
        longestPalindrome(name);
    }
}
