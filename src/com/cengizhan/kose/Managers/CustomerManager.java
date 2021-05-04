package com.cengizhan.kose.Managers;

import com.cengizhan.kose.Entities.Customer;
import com.cengizhan.kose.Utilites.CustomerValidator;

public class CustomerManager {
    public void add(Customer customer){
        if (CustomerValidator.isValid(customer)){
            System.out.println("Sisteme hoş geldin "+customer.getFirstName());
        }else{
            System.out.println("Bilgileriniz yanlış");
        }
    }
}
