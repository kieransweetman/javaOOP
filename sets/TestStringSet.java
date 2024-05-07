package sets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class TestStringSet {
    static HashSet<String> cityStrings = new HashSet<String>(
            Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

    public static void main(String[] args) {
        String city = cityStrings.stream().max(Comparator.comparing(String::length)).orElse(null);

        System.out.println(city);

        cityStrings.remove(city);
        System.out.println(cityStrings);
    }
}
