package L06.algorithims.datastructures;

import java.util.Scanner;

public class Task05MediumTwoSumSorted {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {5, 10, 6, 5, 3, 4};

        int target = 9;

        findPair(arr, target);
    }

    public static void findPair(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.printf("Indexs : [%d, %d], Values : [%d, %d]\n", left, right, arr[left], arr[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}
