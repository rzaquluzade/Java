package L04.controlflow.loops;
import java.util.Scanner;

public class Task07MediumMultiplicationGrid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-----< QİYMƏT DAXİL EDİN >-----");
        System.out.print("               ");
        int N = input.nextInt();
        int totalSum = 0;

        for (int i = 1; i <= N; i++) {
            int rowTotal = 0;

            for (int j = 1; j <= N; j++) {
                System.out.printf("%-3d * %3d   = %3d\n", i, j, i * j);
                rowTotal += (i * j);
            }
            System.out.println("Sətir cəmi : " + rowTotal);
            totalSum += rowTotal;
        }
        System.out.println("Hüceyrələrin ümumi cəmi : " + totalSum);
    }
}
