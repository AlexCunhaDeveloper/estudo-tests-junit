package tests.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount(){

        double amount = 200.0;
        double expectedValue = 196.0;
        Account cc = new Account(1L, 0.0);
        cc.deposit(amount);
        Assertions.assertEquals(expectedValue, cc.getBalance());
    }
}
