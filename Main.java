package HW4Arrays;                                                                   //Morgan Pickens 5/28/2024

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BTree cityTree = new BTree(); // create new 
        boolean loaded = loadData(cityTree, "citiesShort.txt"); // load data

        if (loaded) { // check if data was loaded successfully
            System.out.println("Cities added to the tree:");
            System.out.println(cityTree.printTree()); // print cities in the tree
        } else {
            System.out.println("Failed to load city data from the file."); // print the error message 
        }
    }

    private static boolean loadData(BTree cityTree, String filename) {
        // load city data from a file and add it to the tree
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean firstLine = true; //
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue; //
                }
                line = line.trim(); // leading and trailing spaces
                if (line.isEmpty()) {
                    continue; // 
                }

                // split into parts
                String[] parts = line.split("\\s+", 2); // split into population and the rest

                if (parts.length < 2) {
                    System.out.println("Invalid line format: " + line); // print error message if line format is invalid
                    continue;
                }

                try {
                    int population = Integer.parseInt(parts[0].replaceAll(",", "")); // parse the  population
                    String[] locationParts = parts[1].split(",");

                    if (locationParts.length < 2) {
                        System.out.println("Invalid line format: " + line); // print error message if location format is invalid
                        continue;
                    }

                    String name = locationParts[0].trim(); // get the city 
                    String country = locationParts[locationParts.length - 1].trim(); // get  country
                    String state = locationParts.length > 2 ? locationParts[1].trim() : ""; // get the state 

                    City city = new City(name, country, state, population); // create a new  object
                    cityTree.addCity(city); // add the city to the tree
                } catch (NumberFormatException e) {
                    System.out.println("Invalid population number: " + parts[0]); // print error message if population number is invalid
                }
            }
            return true; 
        } catch (IOException e) {
            e.printStackTrace(); 
            return false; 
        }
    }
}
