package com.cengizhan.kose;

public class ProductManager {
    public void Add(Product product){
        System.out.println("Product Info: \n"+ "id: "+product.getId()+"\n"+ "Name: "+product.getName()+"\n"+ "Description: "+product.getDescription()+"\n"+ "Price: "+product.getPrice()+"\n"+ "Stock: "+product.getStockAmount()+"\n"+ "Color: "+product.getRenk()+"\n"+ "Kod: "+product.getKod());
    }
}
