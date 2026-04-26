package L10.abstraction.polymorphism.Task06MediumExporterDesign;

public class Main {

    public static void main(String[] args) {

        ReportExporter csv =  new CsvExporter();
        ReportExporter json = new JsonExporter();

        System.out.println("<<<<<< CSV export >>>>>>");
        csv.export("Hello world Java");

        System.out.println("<<<<<< JSON export >>>>>>");
        json.export("Hello world Java");
    }
}
