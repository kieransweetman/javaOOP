package files;

public class City {

    String name;
    String department;
    String region;
    int population;

    public City(String name, String department, String region, int population) {
        this.name = name;
        this.department = department;
        this.region = region;
        this.population = population;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getRegion() {
        return region;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "City: " + name + ", Department: " + department + ", Region: " + region + ", Population: " + population;
    }
}
