package command;

// Concrete command: handles library card request for a student
public class LibraryCardRequest implements ServiceRequest {
    private String studentName;

    public LibraryCardRequest(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void execute() {
        System.out.println("Library card request processed for " + studentName);
    }
}
