package maps;

public class Country {
    String name;
    int population;
    String continent;

    public Country(String name, int population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
