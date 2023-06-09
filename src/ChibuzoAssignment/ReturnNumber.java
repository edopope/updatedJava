package ChibuzoAssignment;



public class ReturnNumber {
   public static int counting(String inputs) {
        int count = 0;

        for (int i = 0; i < inputs.length(); i++) {
            if (Character.isDigit(inputs.charAt(i))) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String age = "for 1 in w3 schools";
        System.out.println(ReturnNumber.counting(age));
    }
}