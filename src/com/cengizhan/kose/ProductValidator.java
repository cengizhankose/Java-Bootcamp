package com.cengizhan.kose;

public class ProductValidator {
    static {
        System.out.println("Static yapıcı blok");
    }
    public static boolean isValid(Product product){
        if (product.price>0&&!product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
