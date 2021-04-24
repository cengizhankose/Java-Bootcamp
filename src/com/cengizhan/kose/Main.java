package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 11;
        int sayi3 = 12;
        int enBuyuk = sayi1;

        if (enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if (enBuyuk<sayi3){
            enBuyuk=sayi3;
        }

        System.out.println("En Büyük Sayı : "+enBuyuk);
    }
}
