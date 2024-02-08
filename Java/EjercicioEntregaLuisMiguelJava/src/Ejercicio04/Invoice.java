package Ejercicio04;

import java.util.ArrayList;

public class Invoice {
	private String customer;
    private ArrayList<Product> products;

    public Invoice(String customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }
    }

    public float total() {
        float totalAmount = 0;
        for (Product p : products) {
            totalAmount += p.total();
        }
        return totalAmount;
    }
}
