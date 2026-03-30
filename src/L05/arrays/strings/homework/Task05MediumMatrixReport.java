package L05.arrays.strings.homework;

import java.util.Scanner;

public class Task05MediumMatrixReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[] lineSum = new int[3];
        int[] columnSum = new int[4];

        int totalSum = 0;

        System.out.println("Matrix :");
        for (int i = 0; i < matrix.length; i++) {
            int line = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-3d  ", matrix[i][j]);
                totalSum += matrix[i][j];
                line += matrix[i][j];
            }
            System.out.println();
            lineSum[i] = line;
        }
        System.out.println();

        for (int i = 0; i < lineSum.length; i++) {
            System.out.println((i + 1) + ". line total : " + lineSum[i]);
        }

        for (int j = 0; j < matrix.length + 1; j++) {
            int column = 0;
            for (int i = 0; i < matrix.length; i++) {
                column += matrix[i][j];
            }
            columnSum[j] = column;
        }
        System.out.println();

        for (int i = 0; i < columnSum.length; i++) {
            System.out.println((i + 1) + ". column total : " + columnSum[i]);
        }
        System.out.println();

        System.out.println("Total sum : " + totalSum);

    }
}
