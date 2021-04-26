package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        int number = 29;
        int total = 1;
        for (int i = 2; i<number; i++){
            if (number%i==0){
                total += i;
            }
        }
        if (total == number){
            System.out.println("Sayınız mükemmel sayı");
        }else{
            System.out.println("Sayınız mükemmel sayı değil");
        }
    }
}
