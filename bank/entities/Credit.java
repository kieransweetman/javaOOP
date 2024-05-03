package bank.entities;

public class Credit extends Operation {

    public Credit(String date, double amount) {
        super(date, amount);
    }

    public String getType() {
        return "CREDIT";
    }

    public void calculateBalance() {
        this.amount += amount;
    }

}
