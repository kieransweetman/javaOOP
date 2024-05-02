package bank.entities;

public class TestBank {
    public static void main(String[] args) {
        Account acc1 = new Account(123, 1000);
        Account acc2 = new Account(456, 2000);

        System.out.println("acc1 : " + acc1.toString());
        System.out.println("acc2 : " + acc2.toString());
    }
}
