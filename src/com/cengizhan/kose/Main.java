package com.cengizhan.kose;

import com.cengizhan.kose.Entities.Campaign;
import com.cengizhan.kose.Entities.Customer;
import com.cengizhan.kose.Entities.Product;
import com.cengizhan.kose.Managers.CampaignManager;
import com.cengizhan.kose.Managers.CustomerManager;
import com.cengizhan.kose.Managers.SalesManager;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        SalesManager salesManager = new SalesManager();
        CampaignManager campaignManager = new CampaignManager();

        Customer customer = new Customer(1,2000,"44444444444","Cengizhan","KÖSE","44444444444444444444");
        Product product = new Product(1,50,"COD","en güzel oyun");
        Campaign campaign = new Campaign(10);

        customerManager.add(customer);
        salesManager.Sell(customer,product);
        campaignManager.addDiscount(product,campaign);
        campaignManager.updateDiscount(product,campaign,20);
        campaignManager.removeDiscount(product,campaign);
    }
}
