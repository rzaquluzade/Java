package L10.abstraction.polymorphism.Task07MediumCompositionRefactor;

public class InkjetEngine implements PrintEngine {

    @Override
    public void print(String content) {
        System.out.println("Inkjet print : " + content);
    }
}
