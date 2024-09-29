import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PriceReader {
    private static Map<String, Double> priceMap = new HashMap<>();

    public static void loadPrices(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String productName = parts[0];
                double price = Double.parseDouble(parts[1]);
                priceMap.put(productName, price);
            }
        }
        reader.close();
    }

    public static double getPrice(String productName) {
        return priceMap.getOrDefault(productName, 0.0);
    }
}
