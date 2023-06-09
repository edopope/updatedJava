package Activities;

public class Uyi {


    private int deposit;
    private int balance;
    private int withdraw;



    public void deposit(int amount) {
        if (amount > 0) {

            balance = balance + amount;
        }
    }
    public int getBalance() {
        return  balance;
    }
    public void withdraw(int withdraw){
        if (withdraw <= balance){
            balance = balance - withdraw;
        }
    }


}
