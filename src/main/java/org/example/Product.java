package org.example;
public class Product {
    double cost;
    int id;
    String name;
    Double price;
    int quantity;
    public Product(int id, String name, Double price, int quantity) {
        this.cost = cost;
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString() {
        return "Prodotto{" +
                "id=" + id +
                ", Nome='" + name + '\'' +
                ", Prezzo=" + price + '\'' +
                ", Quantità="+ quantity+ '\'' +
                '}';
    }
}