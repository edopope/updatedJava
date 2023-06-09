package leetcode;

public class IntegerToRomanNumerals {
    public static void integerToRoman(int number){
        int [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder romans = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
        while (number >= values[i]){
            number -= values[i];
            romans.append(romanLetters[i]);
        }
        }
        System.out.println(romans.toString());
    }

    public static void main(String[] args) {
        integerToRoman(20);
        integerToRoman(23);
        integerToRoman(200);
        integerToRoman(201);
    }
}
