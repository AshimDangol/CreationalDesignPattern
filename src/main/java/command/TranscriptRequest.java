package command;

public class TranscriptRequest implements ServiceRequest {
    private String studentName;

    public TranscriptRequest(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void execute() {
        System.out.println("Transcript request processed for " + studentName);
    }
}
