package org.example.Recursion.sortingAndSearching;

/**
 * The BinarySearch class contains methods to perform the Binary Search algorithm on an array of integers.
 */
public class BinarySearch {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, searches for a target value using the Binary Search algorithm, and prints the index of the target value.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int index = binarySearch(arr, target);
        System.out.println("Index of " + target + " is: " + index);
    }

    /**
     * Searches for the target value in the given sorted array using the Binary Search algorithm.
     * The algorithm repeatedly divides the search interval in half. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
     *
     * @param arr The sorted array to be searched.
     * @param target The value to be searched for.
     * @return The index of the target value if found, otherwise -1.
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}