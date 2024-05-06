package entities;

public class Salary {
    String name;
    String lastName;
    double salary;

    public Salary(String csvLineToParse) {
        String[] fields = csvLineToParse.split(";");

        this.name = fields[0];
        this.lastName = fields[1];
        this.salary = Double.parseDouble(fields[2].replace(" ", ""));
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + " " + this.lastName.toUpperCase() + " \nSalary: " + this.salary;
    }

}
