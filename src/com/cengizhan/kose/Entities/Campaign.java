package com.cengizhan.kose.Entities;

public class Campaign {
    private int discount;
    private int beforePrice;

    public Campaign(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getBeforePrice() {
        return beforePrice;
    }

    public void setBeforePrice(int beforePrice) {
        this.beforePrice = beforePrice;
    }
}
