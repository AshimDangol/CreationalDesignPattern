package command.bad;

// Demo showing the problem: request type is passed as a string, no history or queuing
// Each new request type requires adding another else-if branch
public class CommandBadDemo {
    public static void main(String[] args) {
        ServiceHandlerBad handler = new ServiceHandlerBad();
        handler.handleRequest("TRANSCRIPT", "Ram");
        handler.handleRequest("ID_CARD", "Ram");
        handler.handleRequest("CERTIFICATE", "Ram");
        handler.handleRequest("LIBRARY_CARD", "Ram");
    }
}
