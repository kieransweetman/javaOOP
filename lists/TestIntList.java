package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestIntList {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(Collections.max(nums));
        int minIndex = nums.indexOf(Collections.min(nums));
        nums.remove(minIndex);
        System.out.println(nums);

        // new list instead of mutating in place --> can be done with an iterator
        List<Integer> positiveNums = nums.stream().map(n -> n < 0 ? n * -1 : n * 1).collect(Collectors.toList());

        System.out.println(positiveNums);

    }

}
