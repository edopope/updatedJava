package leetcode;
import java.util.Stack;

public class ValidParentheses {


        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            char[] openingBrackets = {'(', '{', '['};
            char[] closingBrackets = {')', '}', ']'};
            char[][] bracketsMap = {
                    {'(', ')'},
                    {'{', '}'},
                    {'[', ']'}
            };

            for (char ch : chars) {
                if (contains(openingBrackets, ch)) {
                    stack.push(ch);
                } else if (contains(closingBrackets, ch)) {
                    if (stack.isEmpty() || !matchesTopBracket(stack.pop(), bracketsMap, ch)) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }

        private static boolean contains(char[] arr, char target) {
            for (char ch : arr) {
                if (ch == target) {
                    return true;
                }
            }
            return false;
        }

        private static boolean matchesTopBracket(char openingBracket, char[][] bracketsMap, char closingBracket) {
            for (char[] pair : bracketsMap) {
                if (pair[0] == openingBracket && pair[1] == closingBracket) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println(isValid("()"));  // true
            System.out.println(isValid("()[]{}"));  // true
            System.out.println(isValid("(]"));  // false
            System.out.println(isValid("([)]"));  // false
            System.out.println(isValid("{[]}"));  // true
        }
    }


