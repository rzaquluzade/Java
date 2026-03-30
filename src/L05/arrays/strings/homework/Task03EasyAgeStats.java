package L05.arrays.strings.homework;

import java.util.Scanner;

public class Task03EasyAgeStats {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {8, 56, 47, 23, 18, 30, 82, 11};

        int total = totalSum(arr);
        int average = numericalAvarage(arr);
        int min = minimumValue(arr);
        int max = maximumValue(arr);

        System.out.printf("Total price : %d\nAverage price : %d\nMinimum price : %d\nMaximum price : %d\n", total, average, min, max);
    }

    public static int numericalAvarage(int[] arr) {

        int sum = totalSum(arr);
        return sum / arr.length;
    }

    public static int totalSum(int[] arr) {

        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static int minimumValue(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maximumValue(int[] arr) {

        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}