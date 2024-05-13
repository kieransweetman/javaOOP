package files;

import java.util.Comparator;

public class NameComparator implements Comparator<City> {

    @Override
    public int compare(City c1, City c2) {
        return c1.getName().compareTo(c2.getName());
    }

}
