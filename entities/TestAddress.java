package entities;

public class TestAddress {

    public static void main(String[] args) {
        PostalAddress add1 = new PostalAddress(1, "Main St", 12345, "Springfield");
        PostalAddress add2 = new PostalAddress(2, "Broadway", 54321, "New York");

        System.out.println("add1: " + add1 + "\nadd2: " + add2);
    }
}
