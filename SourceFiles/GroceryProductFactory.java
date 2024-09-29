/*
 * File: GroceryProductFactory.java
 * Authors: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Lab CRN: 43963
 * Group Number: 5
 * Date: 2024-09-29
 * 
 * Description:
 * Interface for creating grocery products such as vegetables and bread.
 */

public interface GroceryProductFactory {
    Vegetable createVegetable(double price);
    Bread createBread(double price);
}
