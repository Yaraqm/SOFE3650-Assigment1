/*
 * File: Vegetable.java
 * Author: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Date: 2024-09-29
 * 
 * Description:
 * Interface representing a vegetable with a method to get its price.
 */

public class VegetableFactory implements GroceryProductFactory {
    @Override
    public Vegetable createVegetable(double price) {
        return new Carrot(price); // For simplicity, using Carrot as the default vegetable
    }

    @Override
    public Bread createBread(double price) {
        throw new UnsupportedOperationException("This factory does not create bread.");
    }
}

