package chapter14;

public class StringBuilderManipulations {
    public static void main(String[] args) {
        StringBuilder myString = new StringBuilder("hello there how are you?");
        char [] greetings = new char[myString.length()];
        myString.getChars(0,9,greetings,0);
        for (char character: greetings) {
        System.out.print(character);

        }

            }
}
