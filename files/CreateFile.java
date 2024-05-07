package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CreateFile {
    static String csvPath = "/Users/kieransweetman/code/javaOOP/recensement.csv";

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(csvPath));
            String head = lines.get(0);

            List<String> first100 = lines.subList(1, 100);

            String outputPath = "/Users/kieransweetman/code/javaOOP/output.csv"; // replace with your output path
            Files.write(Paths.get(outputPath), first100);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
