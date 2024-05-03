package bank.entities;

public class Credit extends Operation {

    public Credit(String date, double amount) {
        super(date, amount);
    }

    public String getType() {
        return "CREDIT";
    }

    public double getAmount() {
        return this.amount;
    }

}
