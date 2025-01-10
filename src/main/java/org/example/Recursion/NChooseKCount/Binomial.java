package org.example.Recursion.NChooseKCount;

public class Binomial {
    public static void main(String[] args) {
        System.out.println(binomialFunc(16,15));
    }
    public static double binomialFunc (int n, int k) {
        if (k>n){
            return 0;
        }
        if (k == 0 || k == n ){
            return 1;
        }
        return binomialFunc(n-1,k-1) + binomialFunc(n-1,k);
    }
}
