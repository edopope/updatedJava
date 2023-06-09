package tdd;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.discovery.ClasspathResourceSelector;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void depositMoneyTest(){
// given i have an account
        Account amirahTeensAccounts = new Account();
        //when i deposit 3000
        amirahTeensAccounts.deposit(3000);
        //check my balance increases by 3000
        int balance = amirahTeensAccounts.getBalance();

        assertEquals(3000,balance);


        }

     @Test
    public void negativeDepositShouldNotWorkTest() {
         // given i have an account
         Account amirahTeensAccounts = new Account();
         // given i have balance of 10000
         amirahTeensAccounts.deposit(10000);
         assertEquals(10000, amirahTeensAccounts.getBalance());
         // when i deposit money(-5000)
         amirahTeensAccounts.deposit(-5000);
         // check that balance is 10000
         assertEquals(10000, amirahTeensAccounts.getBalance());

     }


    @Test
        public void checkWithdrawalTest() {
    Account amirahTeensAccounts = new Account();
    amirahTeensAccounts.deposit(5000);

    amirahTeensAccounts.Withdraw(100000);
    amirahTeensAccounts.getBalance();
    assertEquals(5000, amirahTeensAccounts.getBalance());
         }





}