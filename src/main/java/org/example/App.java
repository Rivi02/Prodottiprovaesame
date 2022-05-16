package org.example;

import java.util.ArrayList;

public class App
{
    static ArrayList<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        String hostName = "127.0.0.1";
        int portNumber = 1234;
        buildProductList();
    }
    static void buildProductList() {
        products.add(new Product(36213,"Huawei Honor 8 BLACK",25.94, 6));
        products.add(new Product(36214,"Huawei Honor 8 RED",26.94, 1));
        products.add(new Product(36215,"Apple IPhone 13 RED",1226.94, 10));
        System.out.println(products);
    }
}
