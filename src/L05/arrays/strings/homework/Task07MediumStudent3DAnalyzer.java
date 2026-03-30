package L05.arrays.strings.homework;

import java.util.Scanner;

public class Task07MediumStudent3DAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][][] matrix = {
                {{65, 84}, {67, 70}, {89, 92}},
                {{75, 79}, {82, 95}, {93, 78}}
        };

        printAllMatrixs(matrix);
        studentAverages(matrix);
        highestAverages(matrix);
    }

    public static void printAllMatrixs(int[][][] matrix) {
        System.out.println("\n<<< ALL PRICES >>>");
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Student " + (i + 1) + ":");

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Subject " + (j + 1) + ":");

                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.println("Semester " + (k + 1) + ":  " + matrix[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void studentAverages(int[][][] matrix) {
        System.out.println("<<< STUDENT AVERAGE >>>");
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            int count = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                for (int k = 0; k < matrix[i][j].length; k++) {
                    sum += matrix[i][j][k];
                    count++;
                }
            }
            double average = (double) sum / count;
            System.out.println("Student " + (i +1) + " average : " + average);
        }
        System.out.println();
    }

    public static void highestAverages(int[][][] matrix) {
        System.out.println("<<< HIGHEST AVERAGE OF STUDENTS >>>");
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            int bestSubject = 0;
            double bestAverage = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                int sum = 0;

                for (int k = 0; k < matrix[i][j].length; k++) {
                    sum += matrix[i][j][k];
                }
                double average = (double) sum / matrix[i][j].length;

                if (average > bestAverage) {
                    bestAverage = average;
                    bestSubject = j;
                }
            }
            System.out.println("Student " + (i + 1) + " best subject" + bestSubject + "( Average : " + bestAverage + ")");
        }
    }
}

