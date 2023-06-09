   package chapter14;

   import java.util.Scanner;

   public class NumberInString {
                public static void main(String[] args) {
                    String text = """
                            1. we are paragons
                            2. i am a winner 365days a year
                            3. the devil is a liar
                            4. there are 7 days a week
                            """;
                    String digitInText = "";
                    for (int counter = 0; counter < text.length(); counter++) {
                        char currentCharacter = text.charAt(counter);
                        if (Character.isDigit(currentCharacter)) {
                            digitInText += currentCharacter;
                        }
                    }
                    System.out.println(digitInText);
                    StringBuilder builder = new StringBuilder(digitInText);
                    String reverse = String.valueOf(builder.reverse());
                    System.out.println(reverse);
                }
                }
