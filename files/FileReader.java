package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    static String csvPath = "/Users/kieransweetman/code/javaOOP/recensement.csv";

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(csvPath));
            String head = lines.get(0);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
