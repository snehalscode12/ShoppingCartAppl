package javatask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartApp 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        List<Product1> products = new ArrayList<>();

        // Adding sample products
        products.add(new Product1("Laptop", 999.99));
        products.add(new Product1("Headphones", 49.99));
        products.add(new Product1("Smartphone", 699.99));
        products.add(new Product1("SmartWatch", 899.99));
        products.add(new Product1("iPad", 1100.89));
        products.add(new Product1("LED's", 589.99));

        System.out.println("Welcome to the Console Shopping Cart App!");

        while (true) {
            System.out.println("\nAvailable Products:");
            int productId = 1;
            for (Product1 product : products) {
                System.out.println(productId + ". " + product.name + " - $" + product.price);
                productId++;
            }

            System.out.println("Enter the product number to add to the cart (0 to checkout): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for shopping with us!");
                System.out.println("Your total is: $" + cart.calculateTotal());
                break;
            }

            if (choice > 0 && choice <= products.size()) {
                Product1 selectedProduct = products.get(choice - 1);
                cart.addProduct(selectedProduct);
                System.out.println(selectedProduct.name + " added to the cart.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


