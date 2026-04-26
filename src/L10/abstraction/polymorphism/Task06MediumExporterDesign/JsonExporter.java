package L10.abstraction.polymorphism.Task06MediumExporterDesign;

public class JsonExporter extends BaseExporter implements ReportExporter {

    public JsonExporter() {
        super("JSON");
    }

    @Override
    public void export(String data) {
        printHeader();

        String jsonData = "{ \"data\": \"" + data + "\" }";
        System.out.println("JSON data: " + jsonData);

        printFooter();
    }
}
