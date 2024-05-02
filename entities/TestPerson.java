package entities;

public class TestPerson {
    public static void main(String[] args) {
        PostalAddress add1 = new PostalAddress(1, "Main St", 12345, "Springfield");
        PostalAddress add2 = new PostalAddress(2, "Broadway", 54321, "New York");

        Person p1 = new Person("John", "Doe", add1);
        Person p2 = new Person("Jane", "Doe", add2);

        System.out.println("p1: " + p1 + "\np2: " + p2);
    }

}
