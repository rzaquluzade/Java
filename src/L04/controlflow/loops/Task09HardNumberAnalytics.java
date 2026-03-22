package L04.controlflow.loops;
import java.util.Scanner;

public class Task09HardNumberAnalytics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Daxil ediləcək ədədin sayı : ");
        int N = input.nextInt();
        int[] number = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + ". ədədi daxil edin : ");
            number[i] = input.nextInt();
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        double avarage = 0;

        for (int i = 0; i < N; i++) {
            int num = number[i];

            sum += num;

            min = updateMin(min, num);
            max = updateMax(max, num);

            if (num > 0)
                positiveCount++;
            else if (num < 0)
                negativeCount++;
            else
                zeroCount++;

            avarage = sum / N;

        }
        printSummary(sum, avarage, min, max, positiveCount, negativeCount, zeroCount);
    }

    public static int updateMin(int currentMin, int newValue) {
        if (newValue < currentMin)
            return newValue;
            return currentMin;
    }

    public static int updateMax(int currentMax, int newValue) {
        if (newValue > currentMax)
            return newValue;
            return currentMax;
    }

    public static void printSummary(int sum, double avarage, int min, int max, int pos, int neg, int zero) {
        System.out.println("------< ANALITIK HESAB >------");
        System.out.println("Cəmi : " + sum);
        System.out.println("Ədədi ortası : " + avarage);
        System.out.println("Minumum : " + min);
        System.out.println("Maksimum : " + max);
        System.out.println("Ədədin müsbət sayı : " + pos);
        System.out.println("Ədədin mənfi sayı : " + neg);
        System.out.println("Sıfır sayı : " + zero);
    }
}
