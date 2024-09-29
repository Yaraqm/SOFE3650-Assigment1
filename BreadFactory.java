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
