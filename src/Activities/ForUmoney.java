package Activities;

public class ForUmoney {
    private int AccountNUmber;
    private int Balance;

    public ForUmoney(int AccountNumber, int Balance) {
        this.AccountNUmber = AccountNumber;
        if (Balance > 0) {
            this.Balance = Balance;
        }
    }

    public void setAccountNUmber(int accountNUmber) {
        if (AccountNUmber == 3377337)
            this.AccountNUmber = AccountNUmber;

        else {
            System.out.println("enter the correct account number");
        }
    }


    public int getAccountNUmber() {
        return AccountNUmber;
    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }

    public int getBalance() {
        return Balance;
    }

    public void Deposit(int depositAmount) {
        if (depositAmount > 0) {
            Balance += depositAmount;
        }
    }

    public int withdrawal(int withdrawal) {
        if (Balance > 0) {
            withdrawal =Balance - withdrawal;
        }
        return withdrawal;
    }
}



