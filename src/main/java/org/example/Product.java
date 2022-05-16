package org.example;
public class Product {
    int id;
    String name;
    Double price;
    int quantity;
    public Product(int id, String name, Double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString() {
        return "\nProdotto{ \n" +
                "id=" + id +'\n'+
                "Nome=" + name + '\n' +
                "Prezzo=" + price + '\n' +
                "Quantità="+ quantity+ '\n' +
                "}" ;
    }
}