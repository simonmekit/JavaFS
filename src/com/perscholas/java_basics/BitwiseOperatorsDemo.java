package com.perscholas.java_basics;

public class BitwiseOperatorsDemo {
    public static void main(String[] args)
    {
        int x = 58; //111010
        int y = 13; //0001101
        System.out.println("x & y : " + (x & y)); //returns 8 = 1000
        System.out.println("x | y : " + (x | y)); //63=111111
        System.out.println("x ^ y : " + (x ^ y)); //55=110111
        System.out.println("~x : " + (~x));  //-59
        System.out.println("x << y : " + (x << y));
        System.out.println("x >> y : " + (x >> y));
    }
}
