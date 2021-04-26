package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,10,22,34,40};
        int aranacak = 23254;
        boolean sayiVar = false;

        for (int sayi : sayilar){
            if (aranacak==sayi){
                sayiVar=true;
                break;
                }
        }
        if (sayiVar){
            System.out.println(aranacak+" Sayınız dizide bulunmakta");
        }else{
            System.out.println(aranacak+" Sayınız dizide bulunmamaktadır");
        }
    }
}
