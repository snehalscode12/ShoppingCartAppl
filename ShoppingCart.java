package javatask;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart 
{
	List<Product1> items = new ArrayList<>();

    void addProduct(Product1 product) {
        items.add(product);
    }

    double calculateTotal() {
        double total = 0;
        for (Product1 item : items) {
            total += item.price;
        }
        return total;
    }
}

