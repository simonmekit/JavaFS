package com.perscholas.java_basics;

public class PredictFuture {
    public static void main(String[] args) {
        double tution = 10000;
        float rate = 0.07f;
        int i=0;
        while(tution < 20000){
            tution = tution + tution*rate;
            i++;
        }
        System.out.println("Tution: " + tution);
        System.out.println("no of years: " + i);
    }
}
