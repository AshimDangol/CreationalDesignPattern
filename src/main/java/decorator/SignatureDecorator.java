package decorator;

// ConcreteDecorator — adds digital signature feature to the student report
public class SignatureDecorator extends ReportDecorator {

    public SignatureDecorator(StudentReport wrappedReport) {
        super(wrappedReport);
    }

    @Override
    public void generate() {
        super.generate();
        addSignatureFeature();
    }

    private void addSignatureFeature() {
        System.out.println("Adding digital signature");
    }
}
