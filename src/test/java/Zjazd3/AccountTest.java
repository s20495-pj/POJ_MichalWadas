package Zjazd3Tests;

import Zjazd3.Account;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * summary: Test Account class
 * author: Michal Wadas
 **/
public class AccountTest {

    private Account account;

    private static final String ACCOUNT_INFORMATION ="Account[id= 1, name= Michal, balance=2000]";
    private static final int amountLowerThanBalance = 300;
    private static final int amountBiggerThanBalance = 4000;
    private static final int balance = 2000;

    @Before
    public void setUp() {
        account = new Account("1", "Michal", balance);
    }

    @Test
    public void testCredit() {

        int increasedBalance = balance + amountLowerThanBalance;

        Assert.assertEquals(increasedBalance, account.credit(amountLowerThanBalance));
    }

    @Test
    public void testDebitWithLowerAmount() {

        int balanceAfterReduction = account.debit(amountLowerThanBalance);

        Assert.assertTrue(balanceAfterReduction >= 0);
        Assert.assertTrue(balance > balanceAfterReduction);
    }

    @Test
    public void testDebitWithTooBigAmount() {

        //when
        account.debit(amountBiggerThanBalance);

        //then
        int balanceAfterTry = account.getBalance();

        Assert.assertEquals(balance,balanceAfterTry);
    }

    @Test
    public void testTransferToAnotherAccountLowerAmount() {

        //given
        Account accountTo = new Account("2", "Maciek", 400);

        //when
        Assert.assertNotEquals(account.getId(), accountTo.getId());
        int balanceAfterTransfer = account.transferTo(accountTo,amountLowerThanBalance);

        //then
        Assert.assertTrue(balance > balanceAfterTransfer);
        Assert.assertEquals(700, accountTo.getBalance());
        Assert.assertEquals(1700, account.getBalance());
    }

    @Test
    public void testTransferToAnotherAccountButAmountBiggerThanBalance() {

        //given
        Account accountTo = new Account("2", "Maciek", 400);

        Assert.assertEquals(balance, account.transferTo(accountTo, amountBiggerThanBalance));
        Assert.assertEquals(400, accountTo.getBalance());
    }

    @Test
    public void testAccountInformation(){

        Assert.assertEquals(ACCOUNT_INFORMATION,account.toString());
    }
}
