package bank.entities;

public class Account {
    int accountNumber;
    float balance;

    public Account(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + this.getAccountNumber() +
                ", balance=" + this.getBalance() +
                '}';
    }

}
