package org.example.Recursion.sortingAndSearching;

/**
 * The BogoSort class contains methods to perform the BogoSort algorithm on an array of integers.
 */
public class BogoSort {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, sorts it using the BogoSort algorithm, and prints the sorted array.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 5, 2, 3};
        bogoSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts the given array using the BogoSort algorithm.
     * The algorithm repeatedly shuffles the array until it is sorted.
     *
     * @param arr The array to be sorted.
     */
    public static void bogoSort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    /**
     * Shuffles the elements of the given array randomly.
     *
     * @param arr The array to be shuffled.
     */
    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }

    /**
     * Checks if the given array is sorted in non-decreasing order.
     *
     * @param arr The array to be checked.
     * @return true if the array is sorted, false otherwise.
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}