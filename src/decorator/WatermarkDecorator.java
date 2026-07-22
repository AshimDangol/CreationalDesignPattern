package decorator;

// ConcreteDecorator — adds watermark feature to the student report
public class WatermarkDecorator extends ReportDecorator {

    public WatermarkDecorator(StudentReport wrappedReport) {
        super(wrappedReport);
    }

    @Override
    public void generate() {
        super.generate();
        addWatermarkFeature();
    }

    private void addWatermarkFeature() {
        System.out.println("Adding confidential watermark");
    }
}
