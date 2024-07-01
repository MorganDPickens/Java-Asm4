# Java-Asm4
1 Understand
1.1 Know the Objectives
Upon project completion, you will have acquired a solid understanding of the following concepts and their
implementation in code:
• Binary Search Trees
• Writing recursive tree-traversal methods
1.2 Understand the Problem
We will create a binary tree with all necessary methods. We will read data from txt file add nodes and compare
cities by name.
2 Design
2.1 Draw a Class Diagram
Provide a class diagram illustrating the project's structure, including interfaces and all classes, excluding Main.
2.2 Draw an Object Diagram
Submit an object diagram depicting the initial state of the system after adding a few countries and cities,
clearly illustrating the array data and parallelism.
3 Code
3.1 Understand the Details
3.1.1 City
Create a City class that has the following fields, in this order: Name, Country, State, and Population. All of these should
be of String type except Population (integer). Add preconditions to prevent null and empty parameter contents except
for State. Implement interface Comparable<City> and @Override compareTo() method.
3.1.2 BTree
This class manages city data, utilizing the CityTreeInterface.java class. Implement methods to access city-data.
Ensure the constructor doesn’t accept any parameters. For a few methods, you must create an inner private or
protected recursive methods.
3.1.3 Files
Utilize the provided data files: cities.txt cities data (for checking the project use citiesShort.txt file). The Main
class must read a file and add data to your binary tree. For testing, it is better to use cityShort.txt file.
3.2 Use the Interface(s)
Implement the provided interface(s) exactly as specified. Add helper methods as necessary, without altering
the interface.
