package leetcode;

public class ValidPalindrome {
          public static boolean isPalindrome(String s) {
            // Convert to lowercase and remove non-alphanumeric characters
            String cleanString = s.toLowerCase().replaceAll("[^a-z0-9]", "");

            // Check if the clean string is a palindrome
            int left = 0;
            int right = cleanString.length() - 1;

            while (left < right) {
                if (cleanString.charAt(left) != cleanString.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        public static void main(String[] args) {
            String input = "A man, a plan, a canal, Panama!";
            boolean isPalindrome = isPalindrome(input);
            System.out.println("Is Palindrome? " + isPalindrome);
        }
    }


