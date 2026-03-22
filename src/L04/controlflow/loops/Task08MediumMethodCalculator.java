package L04.controlflow.loops;
import java.util.Scanner;

public class Task08MediumMethodCalculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static Integer div(int a, int b) {
        if (b == 0) {
            System.out.println("Sıfıra bölmək olmaz!");
            return null;
        }
        return a /  b;
    }

    public static Integer calculate(int a, int b, char sym) {
        switch (sym) {
            case '+': return add(a, b);
            case '-': return sub(a, b);
            case '*': return mul(a, b);
            case '/': return div(a, b);
            default :
                System.out.println("Naməlum operator.");
                return null;
        }
    }

    public static void printResult(Integer result) {
        if (result != null) {
            System.out.println("Nəticə : " + result);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean davam = true;

        while (davam) {
            System.out.print("Birinci ədəd : ");
            int a = input.nextInt();
            System.out.print("İkİnci ədəd : ");
            int b = input.nextInt();
            System.out.print("Operator (+, -, *, /) :");
            char sym = input.next().charAt(0);

            printResult(calculate(a, b, sym));

            System.out.print("Davam etmək istəyirsiniz? (bəli/xeyir): ");
            if (!input.next().equalsIgnoreCase("bəli")) {
                davam = false;
            }
        }
    }
}
