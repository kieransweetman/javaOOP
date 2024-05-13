package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CreateFile {
    static String csvPath = "/Users/kieransweetman/code/javaOOP/recensement.csv";
    static String outputPath = "/Users/kieransweetman/code/javaOOP/output.csv";

    public static void main(String[] args) {
        try {

            System.out.println("\n");
            System.out.println("Creating File ...");
            System.out.println("-----");

            List<City> cities = FileReader.cities();
            cities.sort(new PopulationComparator());
            List<City> first10 = cities.subList(cities.size() - 10, cities.size());

            String toCsv = CsvUtils.toCSV(first10);

            // remove head if one already
            if (toCsv.startsWith("name")) {
                toCsv = toCsv.substring(toCsv.indexOf("\n") + 1);
            }

            // Start the spinner
            Spinner spinner = new Spinner();
            Thread spinnerThread = new Thread(spinner);
            spinnerThread.start();

            // pausing for 2 seconds to give impression computer is working hard
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Start the timer
            long startTime = System.currentTimeMillis();

            Files.write(Paths.get(outputPath), toCsv.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);

            // Stop the spinner
            spinner.stop();

            // Stop the timer and print the elapsed time
            long endTime = System.currentTimeMillis();
            System.out.println("Elapsed time: " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static class Spinner implements Runnable {
        private boolean running = true;

        public void run() {
            String spinner = "|/-\\";
            int i = 0;
            while (running) {
                System.out.print("\r" + spinner.charAt(i++ % spinner.length()));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void stop() {
            this.running = false;
        }
    }

}
