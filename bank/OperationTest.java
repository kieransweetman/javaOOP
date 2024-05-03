package bank;

import bank.entities.Credit;
import bank.entities.Debit;
import bank.entities.Operation;

public class OperationTest {

    private static final String CREDIT = "CREDIT";
    private static final String DEBIT = "DEBIT";

    public static void main(String[] args) {
        Operation[] operations = {
                new Credit("01-01-24", 400),
                new Credit("07-28-24", 1000.75),
                new Debit("06-09-69", 420),
                new Debit("02-02-02", 2020.20)
        };

        float balance = 0;
        for (Operation operation : operations) {
            System.out.println(operation);
            operation.calculateBalance();
        }

        System.out.println("\nYour final balance is: " + balance);
    }
}
