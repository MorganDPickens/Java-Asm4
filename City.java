package HW4Arrays;                                                                                               //Morgan Pickens 5/28/2024 

public class City implements Comparable<City> {
    private String name; // name of the city
    private String country; // country 
    private String state; // state 
    private int population; // population

    public City(String name, String country, String state, int population) {
        // Constructor to initialize a City object with provided values
        if (name == null || name.isEmpty() || country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.name = name;
        this.country = country;
        this.state = state;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public int getPopulation() {
        return population;
    }
                                                                        // Override 
    @Override
    public int compareTo(City other) {
        // compare cities by name
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        // return string 
        return name + ", " + state + ", " + country + ": " + population;
    }
}

