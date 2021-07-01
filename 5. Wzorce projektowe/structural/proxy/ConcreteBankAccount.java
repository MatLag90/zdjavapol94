package pl.sdacademy.structural.proxy;

public class ConcreteBankAccount implements BankAccount {
    private int balance;

    public ConcreteBankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
