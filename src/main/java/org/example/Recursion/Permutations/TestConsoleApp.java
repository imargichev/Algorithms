package org.example.Recursion.Permutations;

import java.util.Arrays;

public class TestConsoleApp {
    static int[] elements = {1, 2, 3, 4};
    static boolean[] used = new boolean[elements.length];
    static int[] permutations = new int[elements.length];

    public static void main(String[] args) {
        permute(0);
    }

    static void permute(int index) {
        if (index >= elements.length) {
            System.out.println(Arrays.toString(permutations));
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    permutations[index] = elements[i];
                    permute(index + 1);
                    used[i] = false;
                }
            }
        }
    }
}