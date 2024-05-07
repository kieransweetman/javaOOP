package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class CountCountires {

    // o France, 65 millions d’habitants, Europe
    // o Allemagne, 80 millions d’habitants, Europe
    // o Belgique, 10 millions d’habitants, Europe
    // o Russie, 150 millions d’habitants, Asie
    // o Chine, 1.4 milliards d’habitants, Asie
    // o Indonésie, 220 millions d’habitants, Océanie,
    // o Australie, 20 millions d’habitants, Océanie

    public static void main(String[] args) {

        ArrayList<Country> countries = new ArrayList<Country>(Arrays.asList(
                new Country("France", 65, "Europe"),
                new Country("Allemagne", 80, "Europe"),
                new Country("Belgique", 10, "Europe"),
                new Country("Russie", 150, "Asia"),
                new Country("Chine", 1400, "Asia"),
                new Country("Indonésie", 220, "Oceania"),
                new Country("Australie", 20, "Oceania")));

        HashMap<String, Integer> continentsCount = new HashMap<String, Integer>();

        for (Country c : countries) {
            String continent = c.getContinent();
            if (continentsCount.containsKey(continent)) {
                continentsCount.put(continent, continentsCount.get(continent) + 1);
            } else {
                continentsCount.put(continent, 1);
            }
        }

        System.out.println(continentsCount);

    }
}
