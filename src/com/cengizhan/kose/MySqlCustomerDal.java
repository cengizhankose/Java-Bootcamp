package com.cengizhan.kose;

public class MySqlCustomerDal implements ICustomerDal,IReporistory{

    @Override
    public void Add() {
        System.out.println("My sql eklendi");
    }
}
