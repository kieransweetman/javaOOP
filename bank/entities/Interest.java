package bank.entities;

public class Interest extends Account {

    private double rate;

    public Interest(int accountNumber, float balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;

    }

    public double getRate() {
        return this.rate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Interest \n" +
                " rate:" + this.getRate() +
                ",\n";
    }

}
