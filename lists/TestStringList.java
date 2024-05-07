package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStringList {

    public static void main(String[] args) {
        String citiesStr = "Nice, 343000\n" +
                "Carcassonne, 47800\n" +
                "Narbonne, 53400\n" +
                "Lyon, 484000\n" +
                "Foix, 9700\n" +
                "Pau, 77200\n" +
                "Marseille, 850700\n" +
                "Tarbes, 40600";

        List<City> cities = Arrays.stream(citiesStr.split("\n"))
                .map(line -> line.split(", "))
                .map(parts -> new City(parts[0], Integer.parseInt(parts[1])))
                .collect(Collectors.toList());

        System.out.println(cities);

        City maxPop = cities.stream()
                .max(Comparator.comparingInt(City::getPopulation))
                .orElse(null);

        System.out.println(maxPop);

        City minPop = cities.stream()
                .min(Comparator.comparingInt(City::getPopulation))
                .orElse(null);

        cities.remove(minPop);
        System.out.println(minPop);
        System.out.println(cities);

        for (City city : cities) {
            if (city.getPopulation() > 100000) {
                city.setName(city.name.toUpperCase());
            }
        }

        System.out.println(cities);

    }
}
