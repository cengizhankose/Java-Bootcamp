package com.cengizhan.kose;

public class CustomerManager {

    ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void Add(){
        //iş kodları
        customerDal.Add();
    }
}
