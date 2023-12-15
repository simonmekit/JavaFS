package com.perscholas.java_basics;

public class MixeTypeArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array with String, Integer, and double elements
       Object[] mixedArray = new Object[]{"Hello", 42, 3.14};

        for (int i = 0; i < mixedArray.length; i++) {
            if (mixedArray[i] instanceof String) {
                String stringValue = (String) mixedArray[i];
                System.out.println("String value: " + stringValue);
            } else if (mixedArray[i] instanceof Integer) {
                Integer integerValue = (Integer) mixedArray[i];
                System.out.println("Integer value: " + integerValue);
            } else if (mixedArray[i] instanceof Double) {
                Double doubleValue = (Double) mixedArray[i];
                System.out.println("Double value: " + doubleValue);
            }
        }
    }
}