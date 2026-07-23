package command;

// Concrete command: handles certificate request for a student
public class CertificateRequest implements ServiceRequest {
    private String studentName;

    public CertificateRequest(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void execute() {
        System.out.println("Certificate request processed for " + studentName);
    }
}
