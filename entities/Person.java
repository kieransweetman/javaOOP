package entities;

public class Person {
    String name;
    String lastName;
    PostalAddress address;

    public Person(String name, String lastName, PostalAddress address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
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
