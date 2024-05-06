package Salary;

public class Employee extends Participant {

    double monthlyRevenu;

    public Employee(String name, String lastName, double revenu) {
        super(name, lastName);

        this.monthlyRevenu = revenu;
    }

    public double getSalary() {
        return this.monthlyRevenu;
    }

    public String workerData() {
        return this.name + " " + this.lastName + "\nSalary: " + this.getSalary();
    }

    @Override
    public String toString() {
        return this.workerData();
    }
}
