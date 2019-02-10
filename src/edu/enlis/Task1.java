package edu.enlis;

public class Task1 {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int k = 1;

        System.out.println("A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] = k++;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nОтображенная A: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[A.length-1-j][A.length-1-i] + " ");
            }
            System.out.println();
        }
    }
}
