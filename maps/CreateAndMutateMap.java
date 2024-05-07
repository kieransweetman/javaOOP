package maps;

import java.util.HashMap;

public class CreateAndMutateMap {
    public static HashMap<Integer, String> mapVilles = new HashMap<>();

    public static void main(String[] args) {
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");
        mapVilles.put(59, "Lille");

        for (Integer key : mapVilles.keySet()) {
            System.out.println(key);
        }

        for (String value : mapVilles.values()) {
            System.out.println(value);
        }
    }
}
