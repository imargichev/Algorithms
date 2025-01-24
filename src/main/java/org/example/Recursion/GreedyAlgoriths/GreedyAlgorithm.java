package org.example.Recursion.GreedyAlgoriths;

public class GreedyAlgorithm {
    public static void main(String[] args) {
         int coins[] = {1, 2, 5, 10, 20, 50, 100, 200};
            int target = 92;
            int index = coins.length - 1;
            while (target != 0) {
                if (coins[index] <= target) {
                    System.out.println(coins[index]);
                    target -= coins[index];
                } else {
                    index--;
                }
            }
        System.out.println("Done");
    }
}
