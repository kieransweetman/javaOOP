package lists;

import java.util.ArrayList;
import java.util.Arrays;

public class CityTest {
    public static void main(String[] args) {
        String citiesStr = "Nice, 343 000 hab.\n" +
                "Carcassonne, 47 800 hab.\n" +
                "Narbonne, 53 400 hab.\n" +
                "Lyon, 484 000 hab.\n" +
                "Foix, 9 700 hab.\n" +
                "Pau, 77 200 hab.\n" +
                "Marseille, 850 700 hab.\n" +
                "Tarbes, 40 600 hab.";

        ArrayList<String> cities = new ArrayList<>(Arrays.asList(citiesStr.split("\n")));

        System.out.println(cities);

    }
}
