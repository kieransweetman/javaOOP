package maps;

import java.util.HashMap;

public class CreateMap {
    public static void main(String[] args) {
        HashMap<String, Integer> salaryMap = new HashMap<>();

        salaryMap.put("paul", 1750);
        salaryMap.put("hicham", 1825);
        salaryMap.put("yu", 2250);
        salaryMap.put("ingrid", 2015);
        salaryMap.put("chantal", 2418);

        System.out.println(salaryMap.size());

    }
}
