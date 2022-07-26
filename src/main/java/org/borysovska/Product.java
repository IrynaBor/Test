package org.borysovska;

public class Product {
    private final int id;
    private String name;
    private double price;

    public Product(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static Product createProduct (int id, String name, double price){
        Product pr = new Product(id);
        pr.setName(name);
        pr.setPrice(price);
        return pr;
    }
}
