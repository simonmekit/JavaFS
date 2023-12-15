package com.perscholas.java_basics;

import java.util.Scanner;

public class StringTokenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("[!,?._'@]+");
        System.out.println(a.length);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
