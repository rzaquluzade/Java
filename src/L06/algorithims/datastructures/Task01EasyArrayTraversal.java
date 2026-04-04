package L06.algorithims.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class Task01EasyArrayTraversal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] card = {5, 12, 7, 8, 3, 14, 9, 2, 11, 6, 4, 10};

        // Classic for
        System.out.print("Classic for number : ");
        for (int i = 0; i < card.length; i++) {
            System.out.print(card[i] + " ");
        }
        System.out.println();

        // Improved for
        System.out.print("Improved for number : ");
        for (int i : card) {
            System.out.print(i + " ");
        }

        int sum = 0;
        int oddNumber = 0;
        int evenNumber = 0;

        for (int i : card) {
            sum += i;

            if (i % 2 == 0) {
                oddNumber++;
            } else {
                evenNumber++;
            }
        }
        System.out.println();

        System.out.println("Sum : " + sum);
        System.out.println("Number of even numbers : " + evenNumber);
        System.out.println("Number of odd numbers : " + oddNumber);

    }
}
