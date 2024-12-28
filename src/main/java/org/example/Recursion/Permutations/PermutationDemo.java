package org.example.Recursion.Permutations;

import java.util.Arrays;

public class PermutationDemo {
    static int[] elements = {1, 3, 3, 4};

    public static void main(String[] args) {
        permute(0);
    }

    static void permute(int index) {
        if (index == elements.length) {
            System.out.println(Arrays.toString(elements));
            return;
        }
        for (int i = index; i < elements.length; i++) {
            swap(index, i);
            permute(index + 1);
            swap(index, i);
        }
    }

    static void swap(int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}