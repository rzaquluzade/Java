package L05.arrays.strings.homework;

import java.util.Scanner;

public class Task06MediumSeatFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [][] seats = {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4"}
        };

        while (true) {
            System.out.print("Enter seat code : ");
            String seatCode = input.nextLine().toUpperCase();

            boolean found = false;

            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    if (seats[i][j].equals(seatCode)) {
                        System.out.println("Line " + i + ", column " + j);
                        found = true;
                        break;
                    }
                }
                if (found)
                    break;
            }

            if (!found) {
                System.out.println("Seat not found");
            }
        }
    }
}
