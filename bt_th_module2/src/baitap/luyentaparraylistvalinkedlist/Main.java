package baitap.luyentaparraylistvalinkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(1, "Product A", 100.0);
        Product product2 = new Product(2, "Product B", 200.0);
        Product product3 = new Product(3, "Product C", 300.0);

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);

        for(Product product : productManager.getProducts()){
            System.out.println(product);
        }

        Product productToUpdate = new Product(2, "Product B Updated", 250.0);
        productManager.updateProduct(2, productToUpdate);
        productManager.removeProduct(1);
        productManager.getProductByName("Product C");

        System.out.println("lisst sau khi cap nhat va xoa:");
        for(Product product : productManager.getProducts()){
            System.out.println(product);
        }
        System.out.println("list sau khi sap xep:");
        for(Product product : productManager.sortProductsByPrice()){
            System.out.println(product);
        }
    }
}
