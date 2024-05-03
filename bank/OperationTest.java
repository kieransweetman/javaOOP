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
            String type = operation.getType();
            System.out.println("Operation type: " + type);
            System.out.println(operation.date);
            System.out.println(operation.amount);

            if (type == CREDIT) {
                balance += operation.amount;
            } else if (type == DEBIT) {
                // note: can just do else but for readiblity we will add else if instead
                balance -= operation.amount;
            }
        }

        System.out.println("Your final balance is: " + balance);
    }
}
