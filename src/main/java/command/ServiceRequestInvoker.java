package command;

import java.util.ArrayList;
import java.util.List;

public class ServiceRequestInvoker {
    private List<ServiceRequest> requestHistory = new ArrayList<>();

    public void submitRequest(ServiceRequest request) {
        request.execute();
        requestHistory.add(request);
    }

    public void showHistory() {
        System.out.println("Total service requests processed: " + requestHistory.size());
    }
}
