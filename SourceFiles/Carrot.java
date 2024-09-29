/*
 * File: Carrot.java
 * Author: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Date: 2024-09-29
 * 
 * Description:
 * This class represents a Carrot that implements the Vegetable interface.
 */

public class Carrot implements Vegetable {
    private double price;

    public Carrot(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
