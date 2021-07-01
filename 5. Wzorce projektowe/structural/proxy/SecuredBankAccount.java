package pl.sdacademy.structural.proxy;

public class SecuredBankAccount implements BankAccount {
    private BankAccount bankAccount;
    private String password;
    private boolean authenticated; // = false;

    public SecuredBankAccount(BankAccount bankAccount, String password) {
        this.bankAccount = bankAccount;
        this.password = password;
    }

    public void authenticate(String password) {
        if (password.equals(this.password)) {
            authenticated = true;
        } else {
            throw new UnsecuredOperationException();
        }
    }

    private void requireAuthentication() {
        if (!authenticated) {
            throw new UnsecuredOperationException();
        }
    }

    @Override
    public void withdraw(int amount) {
        requireAuthentication();
        bankAccount.withdraw(amount);
    }

    @Override
    public int getBalance() {
        requireAuthentication();
        return bankAccount.getBalance();
    }
}
