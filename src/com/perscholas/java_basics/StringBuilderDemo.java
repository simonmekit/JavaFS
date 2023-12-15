package com.perscholas.java_basics;

import java.io.*;
import java.util.*;
import java.lang.*;
public class StringBuilderDemo {


         public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner s = new Scanner(System.in);
            String A = s.nextLine();
            StringBuilder B = new StringBuilder();
            B.append(A);
            B.reverse();
            if(A.compareTo(B.toString()) == 0)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
