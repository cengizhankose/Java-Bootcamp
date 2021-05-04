package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        DortIslem hesapMakinesi = new DortIslem();

        System.out.println(hesapMakinesi.Topla(3,4));
        System.out.println(hesapMakinesi.Cikar(4,3));
        System.out.println(hesapMakinesi.Bol(6,2));
        System.out.println(hesapMakinesi.Carp(4,2));
    }
}
