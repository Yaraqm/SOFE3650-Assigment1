/*
 * File: BreadFactory.java
 * Author: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Date: 2024-09-29
 * 
 * Description:
 * Factory class for creating Bread products. Currently, it creates Bagels by default.
 * Does not support creating vegetables.
 */


public class BreadFactory implements GroceryProductFactory {
    @Override
    public Bread createBread(double price) {
        return new Bagel(price); // For simplicity, using Bagel as the default bread
    }

    @Override
    public Vegetable createVegetable(double price) {
        throw new UnsupportedOperationException("This factory does not create vegetables.");
    }
}
