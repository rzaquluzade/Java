package l07.oop.fundamental.Task02EasyRectangleModel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first rectangle width : ");
        double width1 = input.nextDouble();
        System.out.print("Enter first rectangle height : ");
        double height1 = input.nextDouble();
        System.out.println();

        System.out.print("Enter second rectangle width : ");
        double width2 = input.nextDouble();
        System.out.print("Enter second rectangle height : ");
        double height2 = input.nextDouble();
        System.out.println();

        Rectangle r1 = new Rectangle(width1, height1);
        Rectangle r2 = new Rectangle(width2, height2);

        System.out.println("First Rectangle:");
        System.out.println("Area : " + r1.area());
        System.out.println("Perimeter : " + r1.perimeter());
        System.out.println();

        System.out.println("Second Rectangle:");
        System.out.println("Area : " + r2.area());
        System.out.println("Perimeter : " + r2.perimeter());
        System.out.println();

        input.close();
    }
}
