package L10.abstraction.polymorphism.Task04EasyAbstractShape;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(4.5),
                new Rectangle(5,6)
        };

        for (Shape s : shapes) {
            s.printName();
            System.out.println( s.area());
            System.out.println();
        }
    }
}
