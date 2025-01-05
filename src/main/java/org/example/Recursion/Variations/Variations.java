package org.example.Recursion.Variations;

import java.util.Arrays;

public class Variations {
    static int[] elements;
    static int[] variations;
    static boolean[] used;

    public static void main(String[] args) {
        elements = new int[]{1, 2, 3};
        variations = new int[2];
        used = new boolean[elements.length];
        variationsFunc(0);

    }

    static void variationsFunc(int index){
        if (index >= variations.length){
            System.out.println(" " + Arrays.toString(variations));
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    variations[index] = elements[i];
                    variationsFunc(index + 1);
                    used[i] = false;
                }
            }
        }
    }
}
