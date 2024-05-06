package Salary;

public class Freelancer extends Participant {

    double daysWorked;
    double dailyRate;

    public Freelancer(String name, String lastName, double days, double rate) {
        super(name, lastName);
        this.daysWorked = days;
        this.dailyRate = rate;
    }

    @Override
    public double getSalary() {
        return this.daysWorked * this.dailyRate;
    }

}
