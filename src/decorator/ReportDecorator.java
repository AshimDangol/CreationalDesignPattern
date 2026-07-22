package decorator;

// Abstract Decorator — holds a reference to a StudentReport and delegates to it
// Concrete decorators extend this to add their own behavior before/after delegation
public abstract class ReportDecorator implements StudentReport {
    protected StudentReport wrappedReport;

    public ReportDecorator(StudentReport wrappedReport) {
        this.wrappedReport = wrappedReport;
    }

    @Override
    public void generate() {
        wrappedReport.generate();
    }
}
