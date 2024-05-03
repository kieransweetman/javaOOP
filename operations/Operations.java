package operations;

public class Operations {
    final public static char ADDITION = '+';
    final public static char SUBTRACTION = '-';
    final public static char MULTI = '*';
    final public static char DIVISION = '/';

    public static double calculate(double a, double b, char operator) {
        double result = 0.0;

        switch (operator) {
            case ADDITION:
                result = a + b;
                break;
            case SUBTRACTION:
                result = a - b;
                break;
            case MULTI:
                result = a * b;
                break;
            case DIVISION:
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("invalid operator provided: " + operator);
        }
        return result;
    }
}
