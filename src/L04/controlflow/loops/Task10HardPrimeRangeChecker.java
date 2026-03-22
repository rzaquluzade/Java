package L04.controlflow.loops;
import java.util.Scanner;

public class Task10HardPrimeRangeChecker {


    public static boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n <= 1) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Start ədədini daxil edin : ");
        int start = input.nextInt();

        System.out.print("End ədədini daxil edin : ");
        int end = input.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int primeCount = 0;
        System.out.print("Sadə ədədlər : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                primeCount++;
            }
        }
        System.out.println("\nÜmumi sadə ədədlərin sayı : " + primeCount);
    }
}
