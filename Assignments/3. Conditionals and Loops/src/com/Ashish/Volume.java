package com.Ashish;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Volume of cone
        float pi = 3.14f;
        int r, h;
        System.out.print("Enter the radius of cone in m: ");
        r = in.nextInt();
        System.out.print("Enter the height of cone in m: ");
        h = in.nextInt();
        float vCo = (pi*(r*r))*h/3;
        System.out.println("Volume of cone is: " + vCo);

        // Volume of prism
    }
}
