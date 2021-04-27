package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        System.out.println(topla(3,5));
        System.out.println(cokluTopla(3,5,6,78,5,3,23,5,6,8,89,45,3));
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static int cokluTopla(int... sayilar){
        int toplam = 0;
        for (int sayi: sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
