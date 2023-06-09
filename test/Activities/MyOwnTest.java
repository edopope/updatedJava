package Activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyOwnTest {
    @Test
    public void AccountTest(){
        Uyi uyiAccount = new Uyi();
        uyiAccount.deposit(3000);
        int balance = uyiAccount.getBalance();
        assertEquals(3000,balance);


    }
    @Test
    public void TestForWithdrawal(){
        Uyi uyiAccount = new Uyi();
        uyiAccount.deposit(8000);
        uyiAccount.withdraw(2000);;
       // int withdraw = uyiAccount.getWithdraw();
        int balance = uyiAccount.getBalance();
        assertEquals(1000,balance);
    }


}