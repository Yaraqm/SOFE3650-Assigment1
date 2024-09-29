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
