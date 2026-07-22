package decorator;

// ConcreteDecorator — adds PDF format feature to the student report
public class PdfDecorator extends ReportDecorator {

    public PdfDecorator(StudentReport wrappedReport) {
        super(wrappedReport);
    }

    @Override
    public void generate() {
        super.generate();
        addPdfFeature();
    }

    private void addPdfFeature() {
        System.out.println("Exporting report to PDF format");
    }
}
