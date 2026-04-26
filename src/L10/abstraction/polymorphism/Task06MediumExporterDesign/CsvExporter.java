package L10.abstraction.polymorphism.Task06MediumExporterDesign;

import L10.abstraction.polymorphism.Task02EasyOverloadingPractice.Calculator;

public class CsvExporter extends BaseExporter implements ReportExporter {

    public CsvExporter () {
        super("CSV");
    }

    @Override
    public void export(String data) {
        printHeader();

        String csvData = data.replace(" ",",");
        System.out.println("CSV data : " + csvData);

        printFooter();
    }
}
