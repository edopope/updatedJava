package ChibuzoAssignment;

public class FunctionPalindrome {
    public static void palindrome(String name){
        String back = " ";
        for (int i = name.length()- 1; i <0 ; i++) {
            back += name.charAt(i);
            if(name ==  back){
                System.out.println("its a palindrome");
            }
            else{
                System.out.println("its not a palindrome");
            }
        } 
    }


    public static void main(String[] args) {
        String colour = "nun";
        palindrome(colour);
    }
}
