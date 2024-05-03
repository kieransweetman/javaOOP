package bank.entities;

public abstract class Operation {

    protected String date;
    protected double amount;

    public Operation(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public abstract String getType();

    public abstract double getAmount();

    @Override
    public String toString() {
        return "date: " + date + ",\namount: " + amount;
    }
}
