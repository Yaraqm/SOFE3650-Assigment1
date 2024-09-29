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
