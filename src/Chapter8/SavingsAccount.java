package Chapter8;

public class SavingsAccount {
    private static double annualInterestRate = 0.08;
    private double savingsBalance;
    private int year;
    private double rate;

    public SavingsAccount(double savingsBalance, int year, double rate) {
        this.savingsBalance = savingsBalance;
        this.year = year;
        this.rate = rate;
    }

    public void calculateMonthlyInterest() {
        double calculate = savingsBalance * annualInterestRate / 12;

        savingsBalance += calculate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double rate){
        annualInterestRate = rate;
    }

    }






