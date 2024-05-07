package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestDoubleSet {
    static HashSet<Double> doubleNums = new HashSet<Double>(Set.of(1.5, 8.25,
            -7.32, 13.3,
            -12.45, 48.5, 0.01));

    public static void main(String[] args) {
        System.out.println(doubleNums);

        double maxD = Collections.max(doubleNums);

        System.out.println(maxD);

        double minD = Collections.min(doubleNums);

        doubleNums.remove(minD);
        System.out.println(doubleNums);

    }

}
