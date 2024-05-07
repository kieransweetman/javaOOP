package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FileReader {
    static String csvPath = "/Users/kieransweetman/code/javaOOP/recensement.csv";

    public static void main(String[] args) {
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

            List<City> cities = new ArrayList<City>();

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

            String outputPath = "/Users/kieransweetman/code/javaOOP/Cities.csv"; // replace with your output path
            Files.write(Paths.get(outputPath), csvLines);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
