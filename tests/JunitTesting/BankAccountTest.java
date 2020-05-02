package JunitTesting;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test(expected = NegativeAmountException.class)
    public void testBankAccountCreation() throws Exception{
        BankAccount bankAccount = new BankAccount(-100);
    }

    @Test
    public void testBankAccountCreationWithInitialBalance(){
        BankAccount bankAccount = new BankAccount(100);
        assertEquals(100, bankAccount.getBalance());
    }

    @Test(expected = NegativeAmountException.class)
    public void testNegativeDepositAmount() throws Exception{
        BankAccount bankAccount = new BankAccount();
        int depositAmount = -120;
        bankAccount.deposit(depositAmount);
    }

    @Test
    public void testDepositAmount(){
        BankAccount bankAccount = new BankAccount();
        int depositAmount = 100;
        bankAccount.deposit(depositAmount);
        assertEquals(depositAmount, bankAccount.getBalance());
    }

    @Test
    public void testWithdraw() throws Exception{
        int initialBalance = 120;
        BankAccount bankAccount = new BankAccount(initialBalance);
        bankAccount.withdraw(100);
        assertEquals(20, bankAccount.getBalance());
    }

    @Test(expected = NegativeAmountException.class)
    public void testNegativeWithdraw() throws Exception{
        BankAccount bankAccount = new BankAccount();
        int withdrawAmount = -120;
        bankAccount.withdraw(withdrawAmount);
    }

    @Test(expected = NotSufficientBalanceException.class)
    public void testInsufficientBalance(){
        BankAccount bankAccount = new BankAccount();
        int withdrawAmount = 120;
        bankAccount.withdraw(withdrawAmount);

    }
}