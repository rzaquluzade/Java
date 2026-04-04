package L06.algorithims.datastructures;

import java.util.Scanner;

public class Task03EasyMinMaxAndAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] points = {84, 75, 64, 87, 51, 78};

        int min = findMinimum(points);
        int max = findMaximum(points);
        int average = numericalAverage(points);

        System.out.printf("Minimum : %d\nMaximum : %d\nAverage : %d\n", min, max, average);

    }

    public static int findMinimum(int[] points) {
        int min = points[0];
        for (int i = 1; i < points.length; i++) {
            if (points[i] < min) {
                min = points[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] points) {
        int max = points[0];
        for (int i = 1; i < points.length; i++) {
            if (points[i] > max) {
                max = points[i];
            }
        }
        return max;
    }

    public static int numericalAverage(int[] points) {
        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += points[i];
        }
        return sum / points.length;
    }
}
