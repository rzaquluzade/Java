package L10.abstraction.polymorphism.Task07MediumCompositionRefactor;

public class LaserEngine implements PrintEngine {

    @Override
    public void print(String content) {
        System.out.println("Laser print : " + content);
    }
}
