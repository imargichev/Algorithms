package org.example.Recursion.Combinations;

public class Combinations {
    static int k = 3;
    static int n = 5;
    static int[] arr = new int[k];

    public static void main(String[] args) {
        comb(0,0);
    }
   static void comb(int index,int start){
        if(index >= k){
            printCombinations();
        }else {
            for (int i = start; i < n; i++) {
                arr[index] = i;
                comb(index + 1, i + 1);
            }
        }
    }

    private static void printCombinations() {
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
