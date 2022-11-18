package com.Ashish;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Perimeter of Circle
        System.out.print("Enter the radius of circle: ");
        int r = in.nextInt();
        float pie = 3.14f;
        float perimeter = (2*pie)*r;
        System.out.println("Perimeter of circle is: " + perimeter);

        // Perimeter of equilateral triangle
        System.out.print("Enter side length of triangle: ");
        int a = in.nextInt();
        int ePer = 3*a;
        System.out.println("Perimeter of equilateral triangle: " + ePer);

        // Perimeter of parallelogram
        System.out.print("Enter side length of parallelogram: ");
        int pa = in.nextInt();
        System.out.print("Enter the base length of parallelogram: ");
        int pb = in.nextInt();
        int pPer = 2*(pa + pb);
        System.out.println("Perimeter of parallelogram is: " + pPer);

        // Perimeter of rectangle
        System.out.print("Enter the length of rectangle: ");
        int rl = in.nextInt();
        System.out.print("Enter the width of rectangle: ");
        int rw = in.nextInt();
        int pRec = 2*(rl + rw);
        System.out.println("Perimeter of rectangle is: " + pRec);

        // Perimeter of square and rhombus
        System.out.print("Enter the side length of square: ");
        int sa = in.nextInt();
        int pSq = 4*sa;
        System.out.println("Perimeter of square is: " + pSq);
    }
}
