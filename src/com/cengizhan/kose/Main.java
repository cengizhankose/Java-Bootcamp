package com.cengizhan.kose;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Kaşlarının arasına dom dom kurşunu deydi.";

        // Birinci ders

        System.out.println(mesaj);
        System.out.println("Eleman Sayısı : "+ mesaj.length());
        System.out.println("3.eleman : "+mesaj.charAt(2));
        System.out.println(mesaj.concat(" mi acaba ?"));
        System.out.println(mesaj.startsWith("K"));
        System.out.println(mesaj.endsWith("!"));
        System.out.println(mesaj.indexOf("dom"));
        System.out.println(mesaj.lastIndexOf("dom"));
        char[] karakterler = new char[6];
        mesaj.getChars(0,6,karakterler,0);
        System.out.println(karakterler);

        //İkinci ders

        String changedMsg = mesaj.replace(" ","-*-");
        System.out.println(changedMsg);
        System.out.println(mesaj.substring(0,5));

        for (String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());// ifadenin başındaki ve sonundaki boşlukları siler
    }
}
