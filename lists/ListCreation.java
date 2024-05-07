package lists;

import java.util.ArrayList;
import java.util.Collections;

public class ListCreation {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers.size());
    }

}
