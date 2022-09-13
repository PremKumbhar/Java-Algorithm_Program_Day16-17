package com.bridgelabz.Algorithm_Program;

import java.util.Arrays;

public class BubbleSort {
	 // method  bubblesort this is parameterized method
    static void bubbleSort(int array[])
    {
        int size = array.length;
        
        //  loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void main(String args[])
    {
        System.out.println("Welcome to Algorithm Programs of BubbleSort");

        int[] data = { 100,80,-80,-1,07,-200,-88 };
        System.out.println("Array Before Sorting");
        System.out.println(Arrays.toString(data));
        BubbleSort.bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
