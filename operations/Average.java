package operations;

import java.util.Arrays;

public class Average {

    double[] numbers;

    public Average() {
        this.numbers = new double[0];
    }

    public Average(double[] numbers) {
        this.numbers = numbers;
    }

    public void addNumber(double num) {
        this.numbers = Arrays.copyOf(this.numbers, this.numbers.length + 1);
        this.numbers[this.numbers.length - 1] = num;
    }

    public void addNumbers(double[] numbers) {
        int currentLength = this.numbers.length;
        this.numbers = Arrays.copyOf(this.numbers, this.numbers.length + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            this.numbers[currentLength + i] = numbers[i];
        }
    }

    public double calculate() {
        double sum = 0.0;

        for (double num : this.numbers) {
            sum += num;
        }

        return sum / this.numbers.length;
    }

}
