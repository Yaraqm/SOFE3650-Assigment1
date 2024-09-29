import java.io.IOException;

public class GroceryStoreTest {
    public static void main(String[] args) {
        try {
            // Load product prices from a file
            PriceReader.loadPrices("C:\\Users\\yaraq\\OneDrive\\Desktop\\University\\Software Design and Architecture Assignment\\src\\prices.txt");

            // Create factories
            GroceryProductFactory vegetableFactory = new VegetableFactory();
            GroceryProductFactory breadFactory = new BreadFactory();

            // Create products
            Vegetable carrot = vegetableFactory.createVegetable(PriceReader.getPrice("Carrot"));
            Bread bagel = breadFactory.createBread(PriceReader.getPrice("Bagel"));

            // Display prices
            System.out.println("Carrot Price: $" + carrot.getPrice());
            System.out.println("Bagel Price: $" + bagel.getPrice());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

