package JunitTesting;

import java.text.DecimalFormat;

public class BankAccount {
    public final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(int initailBalance) {
        deposit(initailBalance);
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount must be positive");
        } else {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new NotSufficientBalanceException("Withdrawal amount can not greater then the balance");
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public String toString(){
        return "Balance is " + MONEY.format(balance);
    }
}
