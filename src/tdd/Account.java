package tdd;

public class Account {
private int balance;
private int withdraw;

    public void deposit(int amount){
      if (amount > 0) {
          balance = balance + amount;
      }
    }

    public int getBalance() {
        return balance;
    }
    public void Withdraw(int amount) {

        if (amount <=  balance) {
            balance = balance - amount;


        }

    }
    }