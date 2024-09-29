/*
 * File: Bagel.java
 * Author: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Date: 2024-09-29
 * 
 * Description: 
 * This class represents a Bagel that implements the Bread interface. 
 * It includes the price of the Bagel and provides an implementation of 
 * the getPrice() method to retrieve the price.
 */


public class Bagel implements Bread {
    private double price;

    public Bagel(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
