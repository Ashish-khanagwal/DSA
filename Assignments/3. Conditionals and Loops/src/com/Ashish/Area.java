package com.Ashish;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Area of Circle

        System.out.print("Enter the value of radius in 'm': ");
        int r = in.nextInt();
        float pie = 3.14f;
        float area = pie*(r*r);
        System.out.println("Area of circle is: " + area);

        // Area of Triangle

        System.out.print("Enter the height of triangle in 'm': ");
        int h = in.nextInt();
        System.out.print("Enter the base length of triangle in 'm': ");
        int b = in.nextInt();
        int trArea = (h*b)/2;
        System.out.println("Area of triangle is: " + trArea);

        // Area of rectangle

        System.out.print("Enter the length of rectangle in 'm': ");
        int l = in.nextInt();
        System.out.print("Enter the breadth of rectangle in 'm': ");
        int bd = in.nextInt();
        int reArea = l*bd;
        System.out.println("Area of Rectangle is: " + reArea);

        // Area of Isosceles triangle ==> Same as area of triangle solved above

        // Area of parallelogram

        System.out.print("Enter the height of parallelogram: ");
        int pl = in.nextInt();
        System.out.print("Enter the base length of parallelogram: ");
        int pb = in.nextInt();
        int pArea = pl*pb;
        System.out.println("Area of Parallelogram is: " + pArea);

        // Area of Rhombus

        System.out.print("Enter length of diagonal-1: ");
        int d1 = in.nextInt();
        System.out.print("Enter the length of diagonal-2: ");
        int d2 = in.nextInt();
        int rArea = (d1*d2)/2;
        System.out.println("Area of Rhombus is: " + rArea);

        // Area of equilateral triangle

        System.out.print("Enter length of one side of triangle: ");
        int ea = in.nextInt();
        int em = ea*ea;
        float eArea = (float) ((1.73/4)*(em));
        System.out.println("Area of equilateral triangle is: " + eArea);
    }
}