package org.example.Recursion.recursion;

/**
 * The Program class contains a method to calculate the sum of an array of integers using recursion.
 */
public class SumNumbersFromAray {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers and calculates the sum using the sum method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Calculate the sum of the array elements starting from index 0 and initial sum 0
        int result = sum(numbers, 0, 0);
        System.out.println(result); // Output the result
    }

    /**
     * Recursively calculates the sum of the elements in the array.
     *
     * @param arr    The array of integers.
     * @param index  The current index in the array.
     * @param number The current sum of the elements processed so far.
     * @return The sum of the elements in the array.
     */
    public static int sum(int[] arr, int index, int number) {
        // Base case: if the current index is equal to the length of the array, return the current sum
        if (arr.length == index) {
            return number;
        }

        // Add the current element to the sum
        number += arr[index];
        // Move to the next index
        index++;
        // Recursive call to process the next element
        return sum(arr, index, number);
    }
}