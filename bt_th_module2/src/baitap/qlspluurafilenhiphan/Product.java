package baitap.qlspluurafilenhiphan;

import java.io.Serializable;

public class Product implements Serializable {
    private String codeProduct;
    private String nameProduct;
    private double priceProduct;
    private String manufacturer;
    private String describe;

    public Product(String codeProduct, String nameProduct, double priceProduct, String manufacturer, String describe) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.manufacturer = manufacturer;
        this.describe = describe;
    }

    public Product() {
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", manufacturer='" + manufacturer + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
