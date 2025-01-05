package org.example.Recursion.Recursion;

/**
 * The RecursiveFactorial class contains a method to calculate the factorial of a number using recursion.
 */
public class RecursiveFactorial {

    /**
     * The main method is the entry point of the program.
     * It calculates the factorial of a given number and prints the result.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Long factorial = factorial(5);
        System.out.println(factorial); // Output the result
    }

    /**
     * Recursively calculates the factorial of a given number.
     *
     * @param num The number to calculate the factorial of.
     * @return The factorial of the given number.
     */
    public static long factorial(int num) {
        // Base case: if the number is 0, return 1
        if (num == 0) {
            return 1;
        }
        // Recursive case: multiply the number by the factorial of the number minus one
        return num * factorial(num - 1);
    }
}