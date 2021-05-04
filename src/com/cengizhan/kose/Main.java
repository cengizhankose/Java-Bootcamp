package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",50000,3,"blue","kod");
        //product.setName("Laptop");
        //product.setId(1);
        //product.setDescription("Asus Laptop");
        //product.setPrice(50000);
        //product.setStockAmount(3);
        //product.setRenk("blue");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
