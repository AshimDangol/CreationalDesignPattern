package command;

import java.util.ArrayList;
import java.util.List;

// Invoker: receives and executes command objects, maintains a history of all requests
// Decouples the requestor from the actual service implementation
public class ServiceRequestInvoker {
    private List<ServiceRequest> requestHistory = new ArrayList<>();

    // Executes the command and records it in the history log
    public void submitRequest(ServiceRequest request) {
        request.execute();
        requestHistory.add(request);
    }

    // Displays the total number of requests processed so far
    public void showHistory() {
        System.out.println("Total service requests processed: " + requestHistory.size());
    }
}
