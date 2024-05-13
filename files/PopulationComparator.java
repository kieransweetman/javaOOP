package files;

import java.util.Comparator;

public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City c1, City c2) {
        return Integer.compare(c1.getPopulation(), c2.getPopulation());
    }

}
