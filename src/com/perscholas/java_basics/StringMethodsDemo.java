package com.perscholas.java_basics;

import java.util.Arrays;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String s1="  hello   ";
        System.out.println(s1+"how are you");        // without trim()
        System.out.println(s1.trim()+" how are you"); // with trim()
        String s2 = "HELLO HOW ARE YOU?";
        System.out.println(s2.toLowerCase()); // toLowerCase()
        System.out.println(s1.toUpperCase()); // toUpperCase()

        String str1 = "Learn ";
        String str2 = "Java";
        // concatenate str1 and str2
        System.out.println(str1.concat(str2)); // "Learn Java"

        // concatenate str2 and str1
        System.out.println(str2.concat(str1)); // "JavaLearn "
        //--- By using + operator---
        String s3 =  "hello";
        String s4 = "Learners";
        //  String s5 = s3.concat(s4); or
        String s5 = s3 + s4;
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2

        // String Supplement is concatenated with character B
        String s10 = "Supplement" + 'B'; // s1 becomes SupplementB

        String vowels = "a::b::c::d::e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

        String msg = "Welcome to Java";
        System.out.println("The first character in the message is " + msg.charAt(0));

        String s11="hello";
        String s21="hello";
        String s31="hemlo";
        String s41="flag";
        System.out.println(s11.compareTo(s21)); // 0 because both are equal
        System.out.println(s11.compareTo(s31)); //-1 because "l" is only one time lower than "m"
        System.out.println(s11.compareTo(s41)); // 2 because "h" is 2 times greater than "f"

        String str12 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str12.substring(0, 4));
        System.out.println(str12.indexOf('v'));//2
        System.out.println(str12.lastIndexOf('j'));//0
        System.out.println(str12.lastIndexOf('a'));//3
        System.out.println(str12.lastIndexOf('J'));//-1 character not in the string
        System.out.println(str12.lastIndexOf("ava")); //1
        System.out.println(str12.lastIndexOf("Java")); //-1

        System.out.println(str12.contains("java")); // true
        System.out.println(str12.contains("python")); // false
        System.out.println(str12.contains("")); // true

        System.out.println(str12.replace('j', 'J'));


        String str13 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str13.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str13.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));

        String str14 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str14.replaceAll(regex, " ")); //Java is fun

        //By Using equals() Method.
        //By Using == Operator.
        //By compareTo() Method.


        String s15="PerScholas";
        String s25="PerScholas";
        String s35=new String("PerScholas");
        String s45="Teksystem";
        System.out.println(s15.equals(s25));//true
        System.out.println(s15.equals(s35));//true
        System.out.println(s15.equals(s45));//false

        System.out.println(s15 == s25);//true (because both refer to same instance)
        System.out.println(s15 == s35);//false(because s35 refers to instance created in nonpool)

        String s16="Perscholas";
        String s26="Perscholas";
        String s36="Perschola";
        String s46="PerscholasX";
        System.out.println(s16.compareTo(s26)); //0
        System.out.println(s16.compareTo(s36)); // 1(because s1>s3)
        System.out.println(s16.compareTo(s46)); // -1(because s1<s4 )




    }
}
