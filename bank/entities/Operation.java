package bank.entities;

public abstract class Operation {

    public String date;
    public double amount;

    public Operation(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public abstract String getType();
}
