package com.javainonevideo.datatypes;

public class Test {
    public static void main(String[] args) {

//        System.out.println("Widening Conversion Example");
//        System.out.println("---------");
//        byte byteValue = 10;
//        short shortValue = byteValue;
//        int intValue = shortValue;
//        long longValue = intValue;
//        float floatValue = longValue;
//        double doubleValue = floatValue;
//        System.out.println("int " + intValue);
//        System.out.println("long " + longValue);
//        System.out.println("float " + floatValue);
//        System.out.println("double " + doubleValue);
//        System.out.println("---------");
//        System.out.println("---------");
//
//        System.out.println("Narrow Conversion Example");
//        System.out.println("---------");
//        double doubleValue1 = 1254.4563759;
//        float floatValue1 = (float) doubleValue1;
//        long longValue1 = (long) floatValue1;
//        int intValue1 = (int) longValue1;
//        System.out.println("int " + intValue1);
//        System.out.println("long " + longValue1);
//        System.out.println("float " + floatValue1);
//        System.out.println("---------");
//
//        // STRING
//
//        int a = 1; // Stores in Stack
//        String str1 = "Hello"; // Stores in heap (string pool)
//        // str1 refers to the memory location or we can say address of the word hello where it is stored.
//        String str2 = "Hello"; // Literal
//        String str3 = new String("Hello"); // Constructor (created a new object by using new keyword)
//
//        System.out.println(str1 == str2); // This is the way of checking the references not the values
//        System.out.println(a == a); // Here it is checking the values, as it is a primitive datatype
//        System.out.println(str1 == str3); // But here, str1 and str3 are different objects & referencing to different addresses.
//        System.out.println(str1.equals(str3));
//        System.out.println(str1.equals(str2));

//        String name = "Ashish";
//        name.toLowerCase();
//        System.out.println(name); // Print Ashish ->
        // In java, Strings are immutable meaning that methods like toLowerCase() do not modify the original string but instead return a new string with the transformation applied
        // reason - toLowerCase() creates new string but we didn't store the results. so for correct way see below:-
          String name = "Ashish";
          name = name.toLowerCase();
          System.out.println(name); // this will print "ashish"
    }
}
