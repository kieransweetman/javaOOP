package bank.entities;

public class Interest extends Account {

    double rate;

    public Interest(int accountNumber, float balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;

    }

    @Override
    public String toString() {
        return super.toString() + "\n Interest \n" +
                " rate:" + this.rate +
                ",\n";
    }

}
