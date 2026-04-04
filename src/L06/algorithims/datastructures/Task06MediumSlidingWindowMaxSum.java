package L06.algorithims.datastructures;

import java.util.Scanner;

public class Task06MediumSlidingWindowMaxSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {5, 6, 2, 11, 9, 8, 3, 8};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value");
            return;
        }

        int currentSum = 0;
        for (int i = 0; i < k ; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;
        int startIndex = 0;

        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];

            if (currentSum < maxSum) {
                maxSum = currentSum;
                startIndex = i - k + 1;
            }
        }

        System.out.println("Max Sum : " + maxSum);
        System.out.println("Window : ");
        for (int i = startIndex; i < startIndex + k; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

