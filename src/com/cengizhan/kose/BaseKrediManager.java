package com.cengizhan.kose;

public class BaseKrediManager {
    //private veya final yaparsak diğer classlar içerisinde override edilemez
    public double hesapla (double tutar){
        return tutar*1.18;
    }
}
