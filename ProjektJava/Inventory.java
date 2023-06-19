import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("Available products:");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - $" + product.getPrice());
        }
    }

    public void sortProductsByName() {
        Collections.sort(products, Comparator.comparing(Product::getName));
        System.out.println("Products sorted by name.");
    }

    public Product getProduct(int productNumber) {
        if (productNumber >= 1 && productNumber <= products.size()) {
            return products.get(productNumber - 1);
        }
        return null;
    }
}
