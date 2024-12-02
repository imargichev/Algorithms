package org.example.Recursion.sortingAndSearching;

/**
 * The BucketSort class contains methods to perform the BucketSort algorithm on an array of integers.
 */
public class BucketSort {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, sorts it using the BucketSort algorithm, and prints the sorted array.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 5, 2, 3};
        bucketSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts the given array using the BucketSort algorithm.
     * The algorithm distributes the elements into buckets, counts the occurrences, and then reconstructs the sorted array.
     *
     * @param arr The array to be sorted.
     */
    public static void bucketSort(int[] arr) {
        // Find the maximum value in the array
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        // Create a bucket array to count occurrences of each value
        int[] bucket = new int[max + 1];
        for (int i : arr) {
            bucket[i]++;
        }

        // Reconstruct the sorted array from the bucket array
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}