package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import lists.City;

public class CityMap {
    public static void main(String[] args) {

        List<String> citiesString = new ArrayList<String>();
        List<Integer> citiesPop = new ArrayList<Integer>();

        Collections.addAll(citiesString, "Nice",
                "Carcassonne",
                "Narbonne",
                "Lyon",
                "Foix",
                "Pau",
                "Marseille",
                "Tarbes");

        Collections.addAll(citiesPop, 343000, 47800, 53400, 484000, 9700, 77200, 850700, 40600);

        HashMap<String, City> cities = new HashMap<String, City>();
        for (int i = 0; i < citiesString.size(); i++) {
            String city = citiesString.get(i);
            int population = citiesPop.get(i);

            cities.put(city, new City(city, population));
        }

        System.out.println(cities);
        System.out.println(cities.size());
        City minPop = Collections.min(cities.values(), Comparator.comparing(City::getPopulation));
        System.out.println(minPop);
        cities.remove(minPop.getName());
        System.out.println(cities);
        System.out.println(cities.size());

    }
}
