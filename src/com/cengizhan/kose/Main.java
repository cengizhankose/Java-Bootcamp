package com.cengizhan.kose;

public class Main {

    public static void main(String[] args) {
	 double[] myList = {1.2,1.3,2.5,5.6,7.8};
	 double total = 0 ;
	 double max = myList[0];

	 for (double num:myList){
	     if (max<num){
	         max = num;
         }
	     total +=num;
	     System.out.println(num);
     }
	 System.out.println("Toplam  = "+total);
	 System.out.println("En Büyük  = "+max);
    }
}
