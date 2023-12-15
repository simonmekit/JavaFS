package com.perscholas.java_basics;

import java.util.Scanner;

public class Substring {
         public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int k = sc.nextInt();
            System.out.println(findSmallest(s,k) + "\n" + findLargest(s,k));

        }
  static String findSmallest(String s, int k){
            String smallest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            smallest = s.substring(0, k);
            for(int j=0; j<=s.length() - (k); j++) {
                String sub = s.substring(j, j+k);
                if (smallest.compareTo(sub) > 0)
                    smallest = sub;
            }
            return smallest;
        }

        static String findLargest(String s, int k){
            String largest = "";
            largest = s.substring(0, k);
            for(int j=0; j<=s.length() - (k); j++) {
                String su = s.substring(j, j + k);
                if (largest.compareTo(su) < 0)
                    largest = su;
            }
            return largest;
        }
    }