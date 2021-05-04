package com.cengizhan.kose.Managers;

import com.cengizhan.kose.Entities.Customer;
import com.cengizhan.kose.Entities.Product;

public class SalesManager {
    public void Sell(Customer customer, Product product){//satış işlemi
        System.out.println(customer.getFirstName()+" "+product.getName()+" oyununu "+product.getPrice()+" fiyatına satın aldı");
    }
}
