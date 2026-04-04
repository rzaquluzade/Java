package L06.algorithims.datastructures;

import java.util.Scanner;

public class Task04EasyDuplicateCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {5, 8, 3, 2, 5, 9, 0, 6, 2, 7, 7};

        int[] frequency = new int[21];

        for (int value : arr) {
            frequency[value]++;
        }

        int duplicateCaunt = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ". - index value - " + frequency[i]);
            }
            if (frequency[i] > 1) {
                duplicateCaunt++;
            }
        }

        System.out.println("Duplicate value count : " + duplicateCaunt);

    }
}
