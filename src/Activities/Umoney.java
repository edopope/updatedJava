package Activities;
import java.util.Scanner;
public class Umoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ForUmoney myBank = new ForUmoney(377337, 1000);
        System.out.printf("YOUR INITIAL BALANCE IS ::%d%n",myBank.getBalance());
        System.out.println("deposit money");
        int depositAmount = input.nextInt();
        myBank.Deposit(depositAmount);
        System.out.printf("your balance is %d%n", myBank.getBalance() );

        System.out.println("enter withdrawal amount::");
      int withdraw = input.nextInt();
       System.out.printf("your balance is %d",myBank.withdrawal(withdraw));

    }
}
