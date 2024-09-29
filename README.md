# SOFE3650-Assigment1
Design Patterns Assignment for Software Design and Architecture

Lab CRN: 43963

Group Number: 5

Yara Mahmoud - 100851246

Rushda Khan - 100865307

Zainab Ahmed - 100868502

This ReadMe file will first outline the structure of this repository, it will then overview the UML diagram that was developed and used to create the code contained within this repository, and finally it will describe the test methods I developed and show the results of their execution.

**Repository Structure:**
This repository has three main parts:

- The SourceFiles folder that contains all the base code files needed to run the program. These base files correspond to each of the classes in the below diagram.
- The TestFiles folder that contains a test driver file, a file containing sample test price values, and a file that holds the code that assists in reading the test values.
- Finally the ReadMe file as well as the UML class diagram itself.

In order to utilize the program contained in this repository all files withing the SourceFiles folder and teh TestFiles folder should be saved to one folder before attempting to run the test class.

**UML Class Diagram:**
This UML diagram is an implementation of the Factory Method Pattern, designed to model a system for creating different grocery products and their corresponding factories.

The GroceryProductFactory is an abstract interface class that serves as the base for specific factory types (such as the BreadFactory). It declares the methods for groceating the grocery products but the actual creation logic is found within the subclasses. Following the Factory Method Pattern the two concrete factory classes, VegetableFactory and BreadFactory, inherit from GroceryProductFactory and provide the specific implementation for creating their specified products. They each take in the price as an input and return an instance of their product, there is a Creation Dependency relationship between them and each of their respective products.

Next comes the Vegetable interface and the Bread interface, they are each the base interfaces that must be implemented by products that fall in their category. The concrete product class Carrot implements the Vegetable Interface, while the concrete product class Bagel implements the bread interface, they each provide specific details for a carrot and bagel respectively as well as their price.


![image](https://github.com/user-attachments/assets/56d0ddc8-1840-492c-b8c9-11b3388c557c)


**Test Methods**
In order to test our program we created the GroceryStoreTest class, the primary focus is on testing the functionality of the Abstract Factory and Factory Method patterns, as well as validating the ability to read product prices from a file. Here's a breakdown of the test methods and their purposes:

 - **Loading Prices from a File (PriceReader.loadPrices):** The first step in the test involves loading product prices from a file (prices.txt) using the PriceReader utility class. This step ensures that the prices are read correctly from the external file and mapped to the corresponding product names.
   
 - **Creating Products via Factory Method (createVegetable and createBread):** After loading the prices, we use the GroceryProductFactory interface and its concrete implementations (VegetableFactory and BreadFactory) to create specific products. This demonstrates that the Factory Method pattern is correctly used to instantiate products with dynamic prices. The expected behaviour, and the one we received, was that the Carrot and Bagel objects are created successfully, and their prices are initialized based on the file data.
   
 - **Verifying Product Prices (getPrice):** Once the products are created, the getPrice method for each product is tested to verify that the correct prices (from the file) have been assigned. This confirms that the factories are correctly setting the prices.

The result of running this test class is shown below:

 ![image](https://github.com/user-attachments/assets/c10e72cc-de63-4894-b9ee-64de56cb5b55)

The correct prices being output with each product effectively demonstrates how the prices are correctly loaded from the price file, the products are made from their respective factories, and that the correct prices were assigned to the correct products, satisfying our key requirements.

