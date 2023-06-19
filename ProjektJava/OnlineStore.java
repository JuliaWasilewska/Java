import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ShoppingCart cart = new ShoppingCart();

        // Dodaj 20 różnych produktów
        Product product1 = new Product("Koszulka", 29.99, 10);
        Product product2 = new Product("Spodnie", 49.99, 5);
        Product product3 = new Product("Buty", 99.99, 3);
        // ... dodaj pozostałe produkty

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        // ... dodaj pozostałe produkty

        Scanner scanner = new Scanner(System.in);

        User user = null;

        while (true) {
            System.out.println("1. Browse products");
            System.out.println("2. Add product to cart");
            System.out.println("3. Remove product from cart");
            System.out.println("4. Display cart");
            System.out.println("5. Sort products by name");
            System.out.println("6. Log in");
            System.out.println("7. Log out");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    inventory.displayProducts();
                    break;
                case 2:
                    System.out.print("Enter the product number: ");
                    int productNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    Product selectedProduct = inventory.getProduct(productNumber);
                    if (selectedProduct != null) {
                        if (selectedProduct.getQuantity() >= quantity) {
                            cart.addProduct(selectedProduct, quantity);
                            System.out.println("Product added to cart.");
                        } else {
                            System.out.println("Insufficient quantity available.");
                        }
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the product number: ");
                    int productNumberToRemove = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the quantity to remove: ");
                    int quantityToRemove = scanner.nextInt();
                    scanner.nextLine();
                    Product productToRemove = inventory.getProduct(productNumberToRemove);
                    if (productToRemove != null) {
                        cart.removeProduct(productToRemove, quantityToRemove);
                        System.out.println("Product removed from cart.");
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;
                case 4:
                    cart.displayCart();
                    break;
                case 5:
                    inventory.sortProductsByName();
                    break;
                case 6:
                    System.out.print("Enter your username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String password = scanner.nextLine();
                    user = new User(username, password);
                    System.out.println("Logged in successfully.");
                    break;
                case 7:
                    System.out.println("Logged out successfully.");
                    user = null;
                    break;
                case 8:
                    System.out.println("Thank you for using the online store. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
