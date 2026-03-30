package L05.arrays.strings.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task04EasyManualSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {5, 11, 3, 9, 17, 20};

        int[] copy = arr.clone();

        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < copy.length - 1 - i; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temporary = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temporary;
                 }
            }
        }

        System.out.print("Original array : " + Arrays.toString(arr));
        System.out.println();
        System.out.print("Modified array : " + Arrays.toString(copy));

    }
}
