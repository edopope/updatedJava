package Chapter4;

public class CreditCard {
    private int accountNumber;
    private int balance;
    public CreditCard(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        if(balance > 0){
            this.balance =balance;
    }


         }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }
}

