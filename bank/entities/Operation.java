package bank.entities;

public abstract class Operation {

    private String date;
    private double amount;

    public Operation(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public abstract String getType();

    public double getAmount() {
        return this.amount;
    };

    public String getDate() {
        return this.date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(String dateString) {
        this.date = dateString;
    }

    @Override
    public String toString() {
        return "date: " + date + ",\namount: " + amount;
    }
}
