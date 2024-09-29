/*
 * File: VegetableFactory.java
 * Authors: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Lab CRN: 43963
 * Group Number: 5
 * Date: 2024-09-29
 * 
 * Description:
 * Factory class for creating Vegetable products. Currently, it creates Carrots by default.
 * Does not support creating bread.
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

