/*
 * File: GroceryStoreTest.java
 * Authors: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Lab CRN: 43963
 * Group Number: 5
 * Date: 2024-09-29
 * 
 * Description:
 * Test class for demonstrating the creation of grocery products using factories 
 * and displaying their prices. Prices are loaded from an external file.
 */

import java.io.IOException;

public class GroceryStoreTest {
    public static void main(String[] args) {
        try {
            // Load product prices from a file
            PriceReader.loadPrices("C:\\Users\\yaraq\\OneDrive\\Desktop\\University\\Software Design and Architecture Assignment\\src\\prices.txt");

            // Create factories
            GroceryProductFactory vegetableFactory = new VegetableFactory();
            GroceryProductFactory breadFactory = new BreadFactory();

            // Create products
            Vegetable carrot = vegetableFactory.createVegetable(PriceReader.getPrice("Carrot"));
            Bread bagel = breadFactory.createBread(PriceReader.getPrice("Bagel"));

            // Display prices
            System.out.println("Carrot Price: $" + carrot.getPrice());
            System.out.println("Bagel Price: $" + bagel.getPrice());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

