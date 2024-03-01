package com.Ashish;

public class Scope {
    public static void main(String[] args) {
        sum(10, 23);

        int temp = 0;
        /* sum =  a + b; (Similarly we can't use sum as it is defined in our sum method)
            and that sum variable is out of scope of this current method.
         */

        /*
        Scoping --> When you're in your bedroom (method), you can only play with the toys (variables)
            that are in your bedroom. You can't play with the toys from the kitchen or the living room.
            Similarly, in Java, a method can only access and use the variables that are defined within it
            or passed to it as parameters.
         */

        /*
        Block Scope Starts
         */

        int a = 10;
        int b = 20;
        String name = "Ashish";

        {
            a = 80; // Already initialised outside the block in the same method, so can't initialise it again.
            // we can modify the value of reference variable, but can't initialise again.
            int c = 89;
            System.out.println(a);

            name = "Khanagwal";
            System.out.println(name);
        }
        System.out.println(a); // Value will be 80, because object has been already modified.
        //  System.out.println(c); -->  Cannot use outside the block
        System.out.println(name);

        /*
        Block Scope Ends

        Anything that is initialised outside the block can be reused inside the block but can't be re-initialised
        inside the block.
        Anything that is initialised inside the block will only be available inside the block and can't be reused
        outside the block but can be re-initialised outside the block.
         */
        int c = 60;
        System.out.println(c); 
    }

    static void sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);

        // temp = 5; (We can't use temp here without initializing it)
    }
}
