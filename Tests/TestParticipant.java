package Tests;

import Salary.Employee;
import Salary.Freelancer;
import Salary.Participant;

public class TestParticipant {

    public static void main(String[] args) {
        Participant[] workers = { new Employee("kieran", "Sweetman", 2500.75),
                new Freelancer("Andre", "Sweetman", 30, 45.5) };

        for (Participant worker : workers) {
            System.out.println(worker.name + "'s revenu: \n" + worker.getSalary());
        }

        System.out.println(workers[0].toString());
    }
}
