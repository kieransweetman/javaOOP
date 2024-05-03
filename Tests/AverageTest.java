package Tests;

import operations.Average;

public class AverageTest {
    public static void main(String[] args) {
        Average avg = new Average();
        Average avg2 = new Average();

        double[] nums = { 1, 2, 3, 4, 5 };
        double[] nums2 = { 6, 7, 8, 9, 10, 11 };

        avg.addNumbers(nums);
        avg2.addNumbers(nums2);

        System.out.println(avg.calculate());
        System.out.println(avg2.calculate());

    }
}
