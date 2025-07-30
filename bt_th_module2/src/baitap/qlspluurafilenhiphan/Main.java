package baitap.qlspluurafilenhiphan;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products = readDataFromFile("C:\\Users\\Admin\\Desktop\\codegym\\module_2\\module2\\bt_th_module2\\src\\baitap\\qlspluurafilenhiphan\\products.txt");
        showData(products);
        addProduct(products);
        showData(products);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name to search: ");
        String name = sc.nextLine();

        List<Product> productsByName = getProductsByName(products, name);
        showData(productsByName);
    }

    public static List<Product> getProductsByName(List<Product> products, String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getNameProduct().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public static void addProduct(List<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code: ");
        String codeProduct = sc.nextLine();
        System.out.print("Enter product name: ");
        String nameProduct = sc.nextLine();
        System.out.print("Enter product price: ");
        double priceProduct = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter product manufacturer: ");
        String manufacturer = sc.nextLine();
        System.out.print("Enter product description: ");
        String describe = sc.nextLine();
        Product product = new Product(codeProduct, nameProduct, priceProduct, manufacturer, describe);
        products.add(product);
        writeDataToFile("C:\\Users\\Admin\\Desktop\\codegym\\module_2\\module2\\bt_th_module2\\src\\baitap\\qlspluurafilenhiphan\\products.txt", products);
        System.out.println("Product added successfully!");
    }

    public static void showData(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public static void writeDataToFile(String path, List<Product> products) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
