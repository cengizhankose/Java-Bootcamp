package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Mouse";
        product.price = 10;
        manager.add(product);

//static ve inner class kullanımı
        DatabaseHelper.Crud.Read();
        DatabaseHelper.Connection.createConnection();
    }
}
