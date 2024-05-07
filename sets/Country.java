package sets;

public class Country {
    String name;
    int population;
    double gdp;

    public Country(String name, int population, double gdp) {
        this.name = name;
        this.population = population;
        this.gdp = gdp;
    }

    public double getGdp() {
        return gdp;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return this.name + " " + this.population + " " + this.gdp;
    }

}
