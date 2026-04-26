package L10.abstraction.polymorphism.Task06MediumExporterDesign;

public abstract class BaseExporter {

    protected String formatName;

    public BaseExporter (String formatName) {
        this.formatName = formatName;
    }

    public void printHeader () {
        System.out.println("Export starts : " + formatName);
    }

    public void printFooter () {
        System.out.println("Export completed : " + formatName);
    }
}
