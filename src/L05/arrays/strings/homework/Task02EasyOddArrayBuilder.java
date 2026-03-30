package L05.arrays.strings.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task02EasyOddArrayBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[50];

        int first = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = first;
            first += 2;
        }

        System.out.print("Full array : ");
        System.out.println(Arrays.toString(arr));
        System.out.printf("First price : %d\nLast price : %d", arr[0], arr[arr.length - 1]);
    }
}
