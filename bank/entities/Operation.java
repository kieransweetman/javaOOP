package bank.entities;

public abstract class Operation {

    protected String date;
    protected double amount;

    public Operation(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public abstract String getType();

    public abstract void calculateBalance();

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
        return "\nType: " + this.getType() + "\ndate: " + date + ",\namount: " + amount;
    }
}
