package com.perscholas.java_basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo1 {
    public ArrayDemo1(){

    }
    public static void main(String[] args) {

        int[] a = {13, 5, 7, 68, 2};
        //finding middle element.
        // Remember only arrays with odd number of elements have middle value.
        System.out.println(a[a.length/2]);
        testClone();
    }
    static void testClone(){
        String[] ar = {"red", "green", "blue", "yellow"};
       System.out.println(Arrays.toString(ar));

       String[] ar2 = ar.clone();
        System.out.println(Arrays.toString(ar2));
    }

}
