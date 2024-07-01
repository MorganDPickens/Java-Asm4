package HW4Arrays;                                                                                    //Morgan Pickens 5/28/2024

import java.util.ArrayList;

public class BTree implements CityTreeInterface {
   
    private class Node {
        City data; // for city data 
        Node left, right; // for our left and right

        Node(City city) {
            data = city; // Initialize node with city data
            left = right = null; // Initialize children as null
        }
    }

    private Node root; // Root node of the binary tree
    private int size; // Number of nodes in the binary tree

    public BTree() {
        root = null; // Initialize root as null
        size = 0; // Initialize size as 0
    }
                                                                               //override section
    @Override
    public int getCount() {
        return size; // return the number of nodES
    }

    @Override
    public void addCity(City city) {
        if (city == null) throw new IllegalArgumentException("City cannot be null"); // Validate city
        root = addCityRec(root, city); // add city to the tree
        size++; // increment size
    }

    private Node addCityRec(Node node, City city) {
        // Recursive method to add a city to the tree
        if (node == null) return new Node(city); // create a new node if the current node is null

        if (city.compareTo(node.data) < 0) {
            node.left = addCityRec(node.left, city); 
        } else {
            node.right = addCityRec(node.right, city); 
        }
        return node; // return the current node
    }

    @Override
    public City searchBT(String name) {
        return searchBTRec(root, name); // search for a city by name in the tree
    }

    private City searchBTRec(Node node, String name) {
        // method to search for a city by name
        if (node == null) return null; // Return null if the node is null
        if (node.data.getName().equals(name)) return node.data; // return the city 

        if (name.compareTo(node.data.getName()) < 0) {
            return searchBTRec(node.left, name); // search in the left subtree if the name is less than the current node
        } else {
            return searchBTRec(node.right, name); // search in the right subtree if the name is greater than or equal to the current node
        }
    }
                                                  //Override Section
    @Override
    public String printTree() {
        StringBuilder sb = new StringBuilder(); // accumulate the result
        printTreeRec(root, sb); // print all cities in the tree
        return sb.toString(); // return the result as a string
    }

    private void printTreeRec(Node node, StringBuilder sb) {
        // method to print all cities in the tree
        if (node != null) {
            printTreeRec(node.left, sb); // traverse the left subtree
            sb.append(node.data.toString()).append("\n"); // append the current city to the result
            printTreeRec(node.right, sb); // traverse the right subtree
        }
    }

    @Override
    public ArrayList<City> listOfTemplate(String template) {
        ArrayList<City> list = new ArrayList<>(); // list to store cities 
        listOfTemplateRec(root, template, list); // Find all cities 
        return list; // return the list
    }

    private void listOfTemplateRec(Node node, String template, ArrayList<City> list) {
        // method to find all cities with names starting with the template
        if (node != null) {
            listOfTemplateRec(node.left, template, list); // traverse the left subtree
            if (node.data.getName().startsWith(template)) {
                list.add(node.data); // add the city to the list if the name starts with the template
            }
            listOfTemplateRec(node.right, template, list); 
        }
    }

    @Override
    public void clear() {
        root = null; // Set the root to null
        size = 0; // Set the size to 0
    }
}
