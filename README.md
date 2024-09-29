# SOFE3650-Assigment1
Design Patterns Assignment for Software Design and Architecture

Yara Mahmoud - 100851246

Rushda Khan - 100865307

Zainab Ahmed - 100868502

This ReadMe file will first outline the structure of this repository, it will then overview the UML diagram that was developed and used to create the code contained within this repository, and finally it will describe the test methods I developed and show the results of their execution.

**Repository Structure:**
This repository has three main parts:

- The SourceFiles folder that contains all the base code files needed to run the program. These base files correspond to each of the classes in the below diagram.
- The TestFiles folder that contains a test driver file, a file containing sample test price values, and a file that holds the code that assists in reading the test values.
- Finally the ReadMe file as well as the UML class diagram itself.

**UML Class Diagram:**
This UML diagram is an implementation of the Factory Method Pattern, designed to model a system for creating different grocery products and their corresponding factories.

The GroceryProductFactory is an abstract interface class that serves as the base for specific factory types (such as the BreadFactory). It declares the methods for groceating the grocery products but the actual creation logic is found within the subclasses. Following the Factory Method Pattern the two concrete factory classes, VegetableFactory and BreadFactory, inherit from GroceryProductFactory and provide the specific implementation for creating their specified products, they each take in the price as an input and return an instance of their product.

Next comes the Vegetable interface and the Bread interface, they are each the base interfaces that must be implemented by products that fall in their category. The concrete product class Carrot implements the Vegetable Interface, while the concrete product class Bagel implements the bread interface, they each provide specific details for a carrot and bagel respectively as well as their price.


![image](https://github.com/user-attachments/assets/56d0ddc8-1840-492c-b8c9-11b3388c557c)
