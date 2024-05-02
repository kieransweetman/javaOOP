package entities;

import entities2.Person;

public class TestPerson {
    public static void main(String[] args) {
        PostalAddress add1 = new PostalAddress(1, "Main St", 12345, "Springfield");
        PostalAddress add2 = new PostalAddress(2, "Broadway", 54321, "New York");

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Jane", "Doe");

        System.out.println("p1: " + p1 + "\np2: " + p2);

        // we need to make sure the visibilty is public for name if we want to acces it
        // from another class instnace
        System.out.println("name is public: " + p1.name);

        p1.setAddress(add1);
        p2.setAddress(add2);

        p1.printFullName();
        p1.setName("Kieran");
        p1.setLastName("Sweetman");
        p1.printFullName();

        System.out.println("p1: " + p1 + "\np2: " + p2);
    }

}
