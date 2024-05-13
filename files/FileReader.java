package files;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FileReader {
    static String csvPath = "/Users/kieransweetman/code/javaOOP/recensement.csv";

    public static List<City> cities() {
        List<City> cities = new ArrayList<City>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(csvPath));
            String head = lines.get(0);
            // removing head since we don't need it
            lines.remove(0);

            for (String line : lines) {
                String[] tokens = line.split(";");
                if (tokens.length == 0)
                    continue;

                String region = tokens[0];
                String name = tokens[6];
                String department = tokens[2];
                int population = Integer.parseInt(tokens[9].replaceAll(" ", ""));

                cities.add(new City(name, department, region, population));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return cities;
    }

    public static void main(String[] args) {
        List<City> cities = new ArrayList<City>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(csvPath));

            // header
            /*
             * NOTE: Items with a start are the fields we need to populate our `City` class
             * Code région;*
             * Nom de la région;
             * Code département;*
             * Code arrondissement;
             * Code canton;
             * Code commune;
             * Nom de la commune;*
             * Population municipale;
             * Population comptée à part;
             * Population totale;*
             * 
             */
            String head = lines.get(0);
            // removing head since we don't need it
            lines.remove(0);

            for (String line : lines) {
                String[] tokens = line.split(";");
                if (tokens.length == 0)
                    continue;

                String region = tokens[0];
                String name = tokens[6];
                String department = tokens[2];
                int population = Integer.parseInt(tokens[9].replaceAll(" ", ""));

                cities.add(new City(name, department, region, population));
            }

            List<City> filteredCities = cities.stream().filter((c) -> c.population > 25000)
                    .collect(Collectors.toList());

            List<String> csvLines = filteredCities.stream()
                    .map(city -> city.getName() + ";" + city.getDepartment() + ";" + city.getRegion() + ";"
                            + city.getPopulation())
                    .collect(Collectors.toList());

            System.out.println("\n");
            System.out.println("comparable implementation");
            System.out.println(cities.subList(0, 2));
            cities.sort(new NameComparator());
            System.out.println(cities.subList(0, 2));
            System.out.println("-----");

            System.out.println("\n");
            System.out.println("Annonations");
            System.out.println("-----");
            CsvUtils.toCSV(cities.subList(0, 20));

            System.out.println("\n");
            System.out.println("comparable implementation POP");
            System.out.println(cities.subList(cities.size() - 2, cities.size()));
            cities.sort(new PopulationComparator());
            System.out.println(cities.subList(cities.size() - 2, cities.size()));
            System.out.println("-----");

            String outputPath = "/Users/kieransweetman/code/javaOOP/Cities.csv"; // replace with your output path
            Files.write(Paths.get(outputPath), csvLines);

            System.out.println("\n");
            System.out.println("Annonations");
            System.out.println("-----");
            CsvUtils.toCSV(cities.subList(0, 20));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
