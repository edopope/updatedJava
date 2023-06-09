package leetcode;
    import java.util.Arrays;

public class ValidAnagram {

        public static boolean isAnagram(String s, String t) {
            // Convert strings to character arrays
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();

            // Sort character arrays
            Arrays.sort(sChars);
            Arrays.sort(tChars);

            // Compare sorted arrays
            return Arrays.equals(sChars, tChars);
        }

        public static void main(String[] args) {
            String s = "anagram";
            String t = "nagaram";

            boolean isAnagram = isAnagram(s, t);
            System.out.println("Are the strings anagrams? " + isAnagram);
        }
    }


