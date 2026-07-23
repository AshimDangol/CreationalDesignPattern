package command.bad;

// Bad design: request handling is done via a string-based if-else chain
// No encapsulation — adding a new request type means modifying this class
public class ServiceHandlerBad {

    // String-based branching — no way to queue, log, or undo requests
    public void handleRequest(String type, String studentName) {
        if ("TRANSCRIPT".equalsIgnoreCase(type)) {
            System.out.println("Transcript request processed for " + studentName);
        } else if ("ID_CARD".equalsIgnoreCase(type)) {
            System.out.println("ID card request processed for " + studentName);
        } else if ("CERTIFICATE".equalsIgnoreCase(type)) {
            System.out.println("Certificate request processed for " + studentName);
        } else if ("LIBRARY_CARD".equalsIgnoreCase(type)) {
            System.out.println("Library card request processed for " + studentName);
        } else {
            System.out.println("Unknown request type: " + type);
        }
    }
}
