package Salary;

public abstract class Participant {
    public String name;
    public String lastName;

    public Participant(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public abstract double getSalary();
}
