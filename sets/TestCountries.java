package sets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class TestCountries {
    public static HashSet<Country> countries = new HashSet<Country>(Arrays.asList(
            new Country("USA", 331449281, 21427700),
            new Country("France", 65273511, 2935511),
            new Country("Allemagne", 83783942, 3845630),
            new Country("UK", 67886011, 2827113),
            new Country("Italie", 60461826, 2001232),
            new Country("Japon", 126476461, 5081770),
            new Country("Chine", 1439323776, 14342903),
            new Country("Russie", 145934462, 1699877),
            new Country("Inde", 1380004385, 2875142)));

    public static void main(String[] args) {
        Country maxCapita = getMaxPerCapita();
        System.out.println(maxCapita);

        Country maxGdp = getMaxGdp();
        System.out.println(maxGdp);

        Country minGdp = getMinGdp();
        System.out.println(minGdp);

        countries.remove(minGdp);

        System.out.println(countries);

    }

    public static Country getMaxPerCapita() {
        return countries.stream()
                .max(Comparator.comparing(country -> country.getGdp() / country.getPopulation()))
                .orElse(null);
    }

    public static Country getMaxGdp() {
        return countries.stream()
                .max(Comparator.comparing(Country::getGdp))
                .orElse(null);
    }

    public static Country getMinGdp() {
        return countries.stream()
                .min(Comparator.comparing(Country::getGdp))
                .orElse(null);
    }
}
