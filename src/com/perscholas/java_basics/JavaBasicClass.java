package com.perscholas.java_basics;

import java.sql.SQLOutput;

public class JavaBasicClass {
    public static void main(String[] args) {
        int x = 43, y = 10;
        int sum = x + y;
        int div_x = x / y;
        System.out.println("Sum of x and y: " + sum);
        System.out.println("Sum of x and y: " + div_x);

        double i = 4.0, j = 10.0;
        double sum2 = i + j;
        System.out.println("Sum of x and y: " + sum2);

        int k = 4;
        double l = 100.5;
        double sum3 = k + l;
        System.out.println("Sum of x and y: " + sum3);

        int n= 4;
        double m = 10.55;
        int result = y / x;
             System.out.println("Sum of x and y: " + result);


        double w = 444.25;
        double z = 10.55;
        double result_w = w / z;
        System.out.println("Sum of x and y: " + result_w);
        //int result_wc = (int) result_w;
        System.out.println("Cast result to int: " + (int)result_w);

        int xy = 5;
        int my = 6;
        int result3 = my / xy;
        System.out.println("Sum of x and y: " + result3);
        //result3 = (double)my;

        final double PI = 3.141415;
        int r = 33;
        double area = PI*r*r;
        System.out.println("Area result: " + area);

        float coffee = 2.15f;
        float cappucino = 4.5f;
        float espresso = 5.5f;
        double subtotal = 3*coffee + 4*cappucino + 2*espresso;
        double SALES_TAX =  0.06*subtotal;
        double totalSales = subtotal + SALES_TAX;
        System.out.println("Total sales: " + totalSales);



    }
}
