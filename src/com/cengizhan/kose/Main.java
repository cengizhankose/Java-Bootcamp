package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Ahmet";
        String ogrenci2 = "Mehmet";
        String ogrenci3 = "Kadir";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("---------ARRAYS----------");

        String[] ogrenciler = new String[3];

        ogrenciler[0] = ogrenci1;
        ogrenciler[1] = ogrenci2;
        ogrenciler[2] = ogrenci3;

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
