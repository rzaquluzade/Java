package L06.algorithims.datastructures;

import java.util.Scanner;

public class Task02EasyLinearSearch {

    public static int linearSearch(int[] card, int targetNumber) {

        for (int i = 0; i < card.length; i++) {
            if (card[i] == targetNumber) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] card = {5, 12, 7, 8, 3, 14, 9, 2, 11, 6, 4, 10};

        System.out.println("Enter the number : ");
        int targetNumber = input.nextInt();

        int index = linearSearch(card, targetNumber);

        if (index != -1) {
            System.out.println("Found");
            System.out.println("Index : " + index);
            System.out.println("Value : " + card[index]);
        }
    }
}
