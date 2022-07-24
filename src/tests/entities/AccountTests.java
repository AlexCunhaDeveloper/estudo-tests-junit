package tests.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.AccountFactory;

public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount(){

        double amount = 200.0;
        double expectedValue = 196.0;
        Account cc = AccountFactory.createEmptyAccount();
        cc.deposit(amount);
        Assertions.assertEquals(expectedValue, cc.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
        double expectedValue = 100.0;
        Account cc =  AccountFactory.createAccount(expectedValue);
        double amount = -200.0;

        cc.deposit(amount);
        Assertions.assertEquals(expectedValue, cc.getBalance());
    }

    @Test
    public void fullWithdrawShouldClearBalance(){
        double expectedValue = 0.0;
        double initialBalance = 800.0;
        Account cc = AccountFactory.createAccount(initialBalance);

        double result = cc.fullWithdraw();
        Assertions.assertTrue(expectedValue == cc.getBalance());
        Assertions.assertTrue(result == initialBalance);

    }
    @Test
    public void withdrawShouldDecreaseBalanceWhenSufficienBalance(){
        Account cc = AccountFactory.createAccount(800.0);
        cc.withdraw(500.0);
        Assertions.assertEquals(300, cc.getBalance());

    }

    @Test
    public void withdrawShouldThrowExeptionWhenInSufficienBalance(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Account cc = AccountFactory.createAccount(800.0);
            cc.withdraw(801.0);
        });


    }

}
