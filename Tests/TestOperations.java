package Tests;

import operations.Operations;
import static operations.Operations.*;

public class TestOperations {
    public static void main(String[] args) {
        double a = 5;
        double b = 5;

        char[] operators = { ADDITION, SUBTRACTION, MULTI, DIVISION };

        System.out.println("a = " + a + "\nb = " + b);
        for (char op : operators) {
            System.out.println("\nop: " + op + "\n---\n" + Operations.calculate(a, b, op));
        }

    }
}
