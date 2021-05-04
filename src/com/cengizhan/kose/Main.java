package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new  WomanGameCalculator();
    }
}
