package L05.arrays.strings.homework;
import java.util.Arrays;
import java.util.Scanner;


public class Task01EasyArrayWarmup {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];

        arr[0] = 5;
        arr[9] = 99;

        System.out.println("Full form of array.");
        System.out.println(Arrays.toString(arr));

    }
}
