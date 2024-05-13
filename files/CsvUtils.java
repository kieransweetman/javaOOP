package files;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CsvUtils {

    public static String toCSV(List<City> cities) {
        Field[] fields = cities.get(0).getClass().getDeclaredFields();
        StringBuilder csv = new StringBuilder();

        // csv head
        Map<Integer, String> headerMap = new TreeMap<>();
        for (Field f : fields) {
            CSVField csvField = f.getAnnotation(CSVField.class);

            headerMap.put(csvField.column(), csvField.name());

        }
        csv.append(String.join(";", headerMap.values())).append(";\n");

        // Records

        Map<Integer, String> valueMap = new TreeMap<>();
        for (City city : cities) {
            for (Field f : fields) {
                CSVField csvField = f.getAnnotation(CSVField.class);

                try {
                    valueMap.put(csvField.column(), f.get(city).toString());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            // add record, go to new line;
            csv.append(String.join(";", valueMap.values())).append(";\n");

        }

        return csv.toString();

    }
}
