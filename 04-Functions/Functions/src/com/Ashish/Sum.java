package com.Ashish;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Let's implement functions/methods");
        sum(); // Calling or revoking the function

        /*
        Due to return type specified as int, we can store result in a variable as we did below
        and can use it further.
         */
        int ans = difference();
        System.out.println("Your desired answer is: " + ans);
    }

    // This is how we define the function.
    // here, we wrote "void". Let's understand this.
    /* here, void will not return any value. It just shows us the results we get from the function,
     but we won't be able to store the result in any variable and use it further in our code.
     So, we require return type other than "void" to store the result and use it. (Refer to line 35)
     */
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    // Here we specified the return type as int instead of void, It will return the value as int.(Refer to line 10)
    static int difference() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();
        int difference = num1 - num2;
        return difference;
    }
}
