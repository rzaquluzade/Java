package L10.abstraction.polymorphism.Task07MediumCompositionRefactor;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(new InkjetEngine());
        printer.printDocument("Hello World");

        System.out.println();

        printer.setEngine(new LaserEngine());
        printer.printDocument("Hello Java");
    }
}
