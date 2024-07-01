package HW4Arrays;                                                                                // Morgan Pickens 5/28/2024

import java.util.ArrayList;

public interface CityTreeInterface {
    public int getCount(); // Retrieve the number of elements in the tree

    public void addCity(City city); // Add a new city to the tree

    public City searchBT(String name); // Search for a city by name in the tree

    public String printTree(); // Print all cities in the tree

    public ArrayList<City> listOfTemplate(String template); // List cities with names starting with the template

    public void clear(); // Remove all nodes from the tree
}
