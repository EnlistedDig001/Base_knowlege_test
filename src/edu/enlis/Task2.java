package edu.enlis;

public class Task2 {
    public static void main(String[] args) {
        int[][] A = new int[1][3];
        int[][] B = new int[3][2];
        int[][] C = new int[A.length][B[0].length];
        int k = 1;

        System.out.println("A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = k++;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        k = 9;
        System.out.println("\nB: ");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = k--;
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        if (A[0].length == B.length) {
            System.out.println("\nA*B: ");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int l = 0; l < B.length; l++) {
                        C[i][j] += A[i][l] * B[l][j];
                    }
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nНельзя умножить.");
        }

    }
}
