package L10.abstraction.polymorphism.Task07MediumCompositionRefactor;

public class Printer {
    private PrintEngine engine;

    public Printer (PrintEngine engine) {
        this.engine = engine;
    }

    public void setEngine(PrintEngine engine) {
        this.engine = engine;
    }

    public void printDocument(String content) {
        engine.print(content);
    }
}
