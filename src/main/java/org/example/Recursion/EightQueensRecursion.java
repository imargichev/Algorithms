package org.example.Recursion;

public class EightQueensRecursion {
    public static void main(String[] args) {

    }
    public static void putQueens(int row){
        if(row == 8){
            printSolution();
            return;
        }
        for(int col = 0; col < 8; col++){
            if(canPlaceQueen(row, col)){
                markAllAttackedPostions(row, col);
                putQueens(row + 1);
                unmarkAllAttackedPostions(row, col);
            }
        }
    }

    public static boolean canPlaceQueen(int row, int col){
        return true;
    }

    public static void markAllAttackedPostions(int row, int col){

    }

    public static void unmarkAllAttackedPostions(int row, int col){

    }

    public static void printSolution(){

    }

}
