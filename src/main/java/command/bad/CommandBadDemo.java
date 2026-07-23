package command.bad;

public class CommandBadDemo {
    public static void main(String[] args) {
        ServiceHandlerBad handler = new ServiceHandlerBad();
        handler.handleRequest("TRANSCRIPT", "Ram");
        handler.handleRequest("ID_CARD", "Ram");
        handler.handleRequest("CERTIFICATE", "Ram");
        handler.handleRequest("LIBRARY_CARD", "Ram");
    }
}
