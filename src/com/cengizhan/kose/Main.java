package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
        int number = 7919;
        boolean isPrime = true;

        for (int i=2 ; i<number;i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(number+" Sayısı Asaldır");
        }else{
            System.out.println(number+" Sayısı Asal Değildir");
        }
    }
}
