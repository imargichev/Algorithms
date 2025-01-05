package org.example.Recursion.SortingAndSearching;

/**
 * The HeapSort class contains methods to perform the HeapSort algorithm on an array of integers.
 */
public class HeapSort {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, sorts it using the HeapSort algorithm, and prints the sorted array.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        heapSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts the given array using the HeapSort algorithm.
     * The algorithm first builds a max heap and then repeatedly extracts the maximum element from the heap and rebuilds the heap.
     *
     * @param arr The array to be sorted.
     */
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Rebuild the heap
            heapify(arr, i, 0);
        }
    }

    /**
     * Converts a subtree rooted with node i into a max heap, assuming the subtrees are already heaps.
     *
     * @param arr The array representing the heap.
     * @param n The size of the heap.
     * @param i The index of the root node of the subtree.
     */
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
}