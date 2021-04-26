package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        String[][] sehirler  = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "Kocaeli";
        sehirler[1][0] = "Edirne";
        sehirler[1][1] = "Trabzon";
        sehirler[1][2] = "Eskişehir";
        sehirler[2][0] = "Sivas";
        sehirler[2][1] = "Antalya";
        sehirler[2][2] = "Muğla";

        for (int i = 0 ;i<sehirler.length;i++){
            for (int j = 0 ;j<sehirler[i].length;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
