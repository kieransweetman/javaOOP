package entities;

import entities2.Person;

public class TestPerson {
    public static void main(String[] args) {
        PostalAddress add1 = new PostalAddress(1, "Main St", 12345, "Springfield");
        PostalAddress add2 = new PostalAddress(2, "Broadway", 54321, "New York");

        Person p1 = new Person("John", "Doe", add1);
        Person p2 = new Person("Jane", "Doe", add2);

        System.out.println("p1: " + p1 + "\np2: " + p2);

        // we need to make sure the visibilty is public for name if we want to acces it
        // from another class instnace
        System.out.println("this wont work!" + p1.name);
    }

}
