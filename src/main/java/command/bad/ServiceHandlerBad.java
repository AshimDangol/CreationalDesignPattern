package command.bad;

public class ServiceHandlerBad {

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
