package com.Ashish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about Arrays in this lecture");
        Scanner in = new Scanner(System.in);

        // Syntax for arrays
        // datatype[] var_name = new datatype[size]
        // Here's an example
        int[] numbers = new int[5];

        // Let's break down the syntax of arrays
        /*
            1. Int[]: This part declares an array of integers. The square brackets [] indicate that numbers is
               an array. The int before the square brackets specifies the type of elements the array will hold,
               in this case, integers.

            2. numbers: This is the name of the array variable. You'll use this name to refer to the array
               later in your code.

            3. = new int[5]: This part creates a new array of integers with a length of 5.
                    a. New int[5] allocates memory for an array of 5 integers.
                    B. The new keyword dynamically allocates memory for the array on the heap during runtime.
                    c. The number in the square brackets [5] indicates the size or length of the array,
                    specifying how many elements it can hold.

             ## Actually working of arrays in memory ##

             1. Heap Memory: The actual memory for the array elements is allocated in the heap memory.
                The heap is a region of memory that is shared among all threads of a Java application.
                When you create an array using new, Java allocates memory for the array elements on the heap.

             2. Stack Memory: The reference variable numbers are stored in the stack memory.
                The stack is a region of memory that stores method calls and local variables.
                When you create a variable like numbers, Java reserves space in the stack memory to store
                a reference to the array. This reference points to the location of the array in the heap.

             3. Internal Working: When you create an array, Java internally manages the memory allocation
                and reallocation for you. When you assign a new array to the variable numbers,
                Java dynamically allocates memory on the heap to store the array elements.
                The reference to this memory location is then stored in the variable numbers in the stack memory.

            ## Explanation of memory working in the context of code

            1. Declaration and Initialization:

                 In the line int[] numbers = new int[5];, we declare an array named numbers that can hold 5 integers.
                 This statement reserves space in the stack memory to store the reference variable numbers.
                 It also allocates memory in the heap to store an array of 5 integers.

            2. Heap Memory Allocation:

                When new int[5] is executed, Java allocates contiguous memory space in the heap to hold 5 integer values.
                Each element of the array is assigned a memory address in the heap.

            3. Stack Memory Allocation:

                The variable numbers are stored in the stack memory.
                This variable holds the memory address (reference) of the array in the heap.

            4. Memory Layout:

                In the stack memory, the variable numbers hold the reference to the array in the heap.
                In the heap memory, contiguous memory blocks are reserved to store the array elements.

            5. Accessing Array Elements:

                After initialization, we assign values to each element of the array using index notation,
                such as numbers[0] = 10;.
                Each element of the array occupies a specific memory location in the heap.

            6. Printing Array Elements:

                We use a loop to iterate through the array and print each element along with its index.
                The loop accesses each element of the array using index notation and retrieves the
                corresponding value stored in the heap memory.

            7. Deallocation:

                Java automatically manages memory deallocation for the array.
                When the array goes out of scope or is no longer referenced, the memory allocated for the
                array in the heap is automatically reclaimed by the garbage collector.

            In summary, the numbers array is stored in the heap memory, while the reference to the array is
            stored in the stack memory. Java's memory management system ensures efficient allocation and
            deallocation of memory for arrays, making it easier for developers to work with dynamic data structures.
         */
    }
}