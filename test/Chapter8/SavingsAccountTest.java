package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    @Test
    public void checkSavingsAccount() {
        SavingsAccount saver1 = new SavingsAccount(2000, 1, 0.09);
        SavingsAccount saver2 = new SavingsAccount(3000,1,0.4);
        saver1.calculateMonthlyInterest();
        System.out.println(saver1.getSavingsBalance());


    }
}