package ChibuzoAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {
    public static Scanner input = new Scanner(System.in);
private static String name;
private static String address;
private static String email;
private static int telephoneNumber;
    public static void main(String[] args) {

        boolean continueLoop = true;
        String main = """
                SONY XPERIA
                PHONEBOOK
                PRESS 1 FOR NAME
                PRESS 2 FOR ADDRESS
                PRESS 3 FOR TELEPHONE
                PRESS 4 FOR EMAIL
                PRESS 5 TO EXIT APPLICATION
                """;

        System.out.println(main);
        do {
            try {
                String phoneInput = input.nextLine();
                switch ((Integer.parseInt(phoneInput))) {
                    case 1:
                        createName();
                    case 2:
                        displayAddress();
                    case 3:
                        telephoneNumber();
                    case 4:
                        email();
                    case 5:
                        leavePhonebook();
                }
            } catch (Exception m) {

                System.out.println("enter a valid command");
            }
        } while (continueLoop);
    }

    private static void leavePhonebook() {
        System.out.println("Thank you for using Sony Phonebook");
    }

    private static void email() {
        try {
            PhoneBook.email = input.nextLine();
            System.out.println(email);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid name");

        }

    }

    private static void telephoneNumber() {
        try {
            PhoneBook.telephoneNumber = input.nextInt();
        } catch (InputMismatchException m) {

            System.out.println(telephoneNumber);
        }
    }
    private static void createName() {
        // String name = ;
        try {
            PhoneBook.name = input.nextLine();
        } catch (InputMismatchException m) {
            System.out.println(name);
        }
    }

    private static void displayAddress() {
        try {
            PhoneBook.address = input.nextLine();
        } catch (InputMismatchException mismatch) {
            System.out.println(address);
        }
    }

    public static String DisplayString() {
        return String.format(
                """
                =====================
                Name:%s%n
                Address:%s%n
                Telephone:%s%n
                Email:%s%n
                =====================""",name,address,telephoneNumber,email);

    }

}

