package ProjektJava;

import java.util.*;

public class OnlineStore {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ShoppingCart cart = new ShoppingCart();


        Product product1 = new Product("Koszulka", 29.99, 10);
        Product product2 = new Product("Spodnie", 49.99, 5);
        Product product3 = new Product("Buty", 99.99, 3);
        Product product4 = new Product("Kurtka", 149.99, 8);
        Product product5 = new Product("Szkarpety", 9.99, 20);
        Product product6 = new Product("Czapka", 19.99, 15);
        Product product7 = new Product("Plecak", 39.99, 7);
        Product product8 = new Product("Bluza", 39.99, 12);
        Product product9 = new Product("Spodenki", 24.99, 6);
        Product product10 = new Product("Sweter", 59.99, 4);
        Product product11 = new Product("Koszula", 34.99, 9);
        Product product12 = new Product("Sukienka", 69.99, 2);
        Product product13 = new Product("Jeansy", 44.99, 10);
        Product product14 = new Product("Okulary przeciwsłoneczne", 79.99, 3);
        Product product15 = new Product("Zegarek", 99.99, 5);
        Product product16 = new Product("Portfel", 29.99, 8);
        Product product17 = new Product("Krawat", 14.99, 12);
        Product product18 = new Product("Biustonosz", 34.99, 6);
        Product product19 = new Product("Skarpety sportowe", 14.99, 15);
        Product product20 = new Product("Rękawiczki", 9.99, 10);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.addProduct(product4);
        inventory.addProduct(product5);
        inventory.addProduct(product6);
        inventory.addProduct(product7);
        inventory.addProduct(product8);
        inventory.addProduct(product9);
        inventory.addProduct(product10);
        inventory.addProduct(product11);
        inventory.addProduct(product12);
        inventory.addProduct(product13);
        inventory.addProduct(product14);
        inventory.addProduct(product15);
        inventory.addProduct(product16);
        inventory.addProduct(product17);
        inventory.addProduct(product18);
        inventory.addProduct(product19);
        inventory.addProduct(product20);

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
                    System.out.println("Logged in as " + user.getUsername());
                    break;
                case 7:
                    user = null;
                    System.out.println("Logged out.");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}
