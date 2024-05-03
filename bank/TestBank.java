package bank;

import bank.entities.Account;
import bank.entities.Interest;

public class TestBank {
    public static void main(String[] args) {
        Account acc = new Account(123, 1000);
        Account intAcc = new Interest(456, 2000, 0.05);

        Account[] accounts = { acc, intAcc };

        for (Account account : accounts) {
            System.out.println(account.toString());
        }

    }
}
