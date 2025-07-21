package baitap.luyentaparraylistvalinkedlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
//    private List<Product> products = new ArrayList<>();
    private List<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void updateProduct(int id, Product newProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, newProduct);
                return;
            }
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }


    public List<Product> sortProductsByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        return products;
    }
}
