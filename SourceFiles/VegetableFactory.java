

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

