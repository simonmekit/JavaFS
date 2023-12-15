package com.perscholas.java_basics;

import java.util.Scanner;

public class GreatestCommonDevisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int k = 1;
        int smaller = Math.min(n1, n2);// n1 < n2? n1: n2;
        for(int i = 1; i<=smaller; i++)
            if(n1%i == 0 && n2%i == 0)
                k = i;
        System.out.println("GCD: " + k);
    }
}
