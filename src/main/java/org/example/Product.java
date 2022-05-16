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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
