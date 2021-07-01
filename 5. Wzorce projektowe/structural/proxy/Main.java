package pl.sdacademy.structural.proxy;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new ConcreteBankAccount(1234);
        System.out.println("Stan konta: " + bankAccount.getBalance());
        bankAccount.withdraw(100);
        System.out.println("Stan konta po wypłaceniu 100: " + bankAccount.getBalance());

        SecuredBankAccount securedBankAccount = new SecuredBankAccount(bankAccount, "abc123");
//        System.out.println(securedBankAccount.getBalance());
        System.out.println("Dokonujemy autentykacji w kontekście zabezpieczonego konta.");
        securedBankAccount.authenticate("abc123");
        System.out.println("Stan konta zabezpieczonego: " + securedBankAccount.getBalance());
        securedBankAccount.withdraw(250);
        System.out.println("Stan konta zabezpieczonego po wypłacie 250: " + securedBankAccount.getBalance());
    }
}
