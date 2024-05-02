package entities2;

import entities.PostalAddress;

public class Person {
    // since we acces this in another package, it must be public
    public String name;
    String lastName;
    PostalAddress address;

    // constructors
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person(String name, String lastName, PostalAddress address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    // getters and setters

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public PostalAddress getAddress() {
        return this.address;
    }

    public void setAddress(PostalAddress address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // methods

    public void printFullName() {
        System.out.println("\n" + this.lastName.toUpperCase() + " " + this.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
