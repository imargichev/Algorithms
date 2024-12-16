package org.example.Recursion.exercises;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 6, 8, 4, 3, 1, 7, 9, 1};
        sort(numbers, 0, numbers.length - 1);
    }

    private static void sort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int middleIndex = (startIndex + endIndex) / 2;

        sort(array, startIndex, middleIndex);
        sort(array, middleIndex + 1, endIndex);
        merge(array, startIndex, middleIndex, endIndex);
    }

    private static void merge(int[] array, int startIndex, int middleIndex, int endIndex) {
        if (array[middleIndex] <= array[middleIndex + 1]) {
            return;
        }
        int[] helpArr = new int[array.length];
        System.arraycopy(array, startIndex, helpArr, startIndex, endIndex - startIndex + 1);

        int leftIndex = startIndex;
        int rightIndex = middleIndex + 1;

        for (int i = startIndex; i <= endIndex; i++) {
            if (leftIndex > middleIndex) {
                array[i] = helpArr[rightIndex++];
            } else if (rightIndex > endIndex) {
                array[i] = helpArr[leftIndex++];
            } else if (helpArr[leftIndex] <= helpArr[rightIndex]) {
                array[i] = helpArr[leftIndex++];
            } else {
                array[i] = helpArr[rightIndex++];
            }
        }
    }
}