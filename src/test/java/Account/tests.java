package Account;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tests {
    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount(){
        double amount = 200.0;
        double expectedValue = 196.0;
        Account acc = new Account(1, 0.0);
        acc.deposit(amount);
        Assertions.assertEquals(expectedValue, acc.getBalance());

    }
    @Test
    public void depositShouldDoNothingWhenNegativeAmount(){
        double expectedValue = 100.0;
        Account acc = new Account(2, expectedValue);
        double amount = -200.0;
        acc.deposit(amount);
        Assertions.assertEquals(expectedValue, acc.getBalance());
    }
    @Test
    public void fullWithDrawShouldCleanBalanceAndReturnFullBalance(){
        double expectedValue = 0;
        double initialBalance = 800;
        Account acc = new Account(3, initialBalance);
        double result =  acc.fullWithDraw();
        Assertions.assertTrue(expectedValue == acc.getBalance());
        Assertions.assertTrue(result == initialBalance);



    }
}
