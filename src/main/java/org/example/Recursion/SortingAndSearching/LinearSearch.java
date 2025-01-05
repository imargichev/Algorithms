package org.example.Recursion.SortingAndSearching;

/**
 * The LinearSearch class contains methods to perform the Linear Search algorithm on an array of integers.
 */
public class LinearSearch {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, searches for a target value using the Linear Search algorithm, and prints the index of the target value.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int index = linearSearch(arr, 5);
        System.out.println(index);
    }

    /**
     * Searches for the target value in the given array using the Linear Search algorithm.
     * The algorithm checks each element of the array sequentially until the target value is found or the end of the array is reached.
     *
     * @param arr The array to be searched.
     * @param target The value to be searched for.
     * @return The index of the target value if found, otherwise -1.
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}