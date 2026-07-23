package command;

public class IdCardRequest implements ServiceRequest {
    private String studentName;

    public IdCardRequest(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void execute() {
        System.out.println("ID card request processed for " + studentName);
    }
}
