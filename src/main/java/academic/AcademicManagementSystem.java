package academic;

import command.CertificateRequest;
import command.IdCardRequest;
import command.LibraryCardRequest;
import command.ServiceRequestInvoker;
import command.TranscriptRequest;
import observer.DepartmentNotifier;
import observer.ParentNotifier;
import observer.ResultPublisher;
import observer.StudentNotifier;
import state.ApplicationContext;
import strategy.BankTransferPayment;
import strategy.ESewaPayment;
import strategy.KhaltiPayment;
import strategy.PaymentContext;

// Facade for the Academic Management System — integrates all 4 behavioral design patterns
// Provides a unified interface for application lifecycle, fee payment, result publication, and service requests
public class AcademicManagementSystem {
    private ApplicationContext appContext;
    private PaymentContext paymentContext;
    private ResultPublisher resultPublisher;
    private ServiceRequestInvoker requestInvoker;

    // Initializes all four pattern contexts
    public AcademicManagementSystem() {
        this.appContext = new ApplicationContext();
        this.paymentContext = new PaymentContext();
        this.resultPublisher = new ResultPublisher();
        this.requestInvoker = new ServiceRequestInvoker();
    }

    // Runs the full application lifecycle using the State pattern
    public void processApplication() {
        System.out.println("--- Application Lifecycle (State) ---");
        while (!"Enrolled".equals(appContext.getCurrentState()) && !"Rejected".equals(appContext.getCurrentState())) {
            System.out.println("State: " + appContext.getCurrentState());
            appContext.next();
        }
        System.out.println("Final state: " + appContext.getCurrentState());
    }

    // Rejects the application, bypassing normal flow
    public void rejectApplication() {
        appContext.reject();
    }

    // Processes fee payment using the selected Strategy at runtime
    public void payFees(String method, double amount) {
        System.out.println("\n--- Fee Payment (Strategy) ---");
        switch (method.toUpperCase()) {
            case "KHALTI": paymentContext.setPaymentStrategy(new KhaltiPayment()); break;
            case "ESEWA": paymentContext.setPaymentStrategy(new ESewaPayment()); break;
            case "BANK": paymentContext.setPaymentStrategy(new BankTransferPayment()); break;
            default: System.out.println("Unknown payment method: " + method); return;
        }
        paymentContext.executePayment(amount);
    }

    // Publishes results and notifies all registered observers
    public void publishResults(String studentName, String parentName, String department) {
        System.out.println("\n--- Result Publication (Observer) ---");
        resultPublisher.addObserver(new StudentNotifier(studentName));
        resultPublisher.addObserver(new ParentNotifier(parentName));
        resultPublisher.addObserver(new DepartmentNotifier(department));
        resultPublisher.publishResults(studentName);
    }

    // Submits multiple service requests via the Command pattern invoker
    public void requestService(String studentName) {
        System.out.println("\n--- Service Requests (Command) ---");
        requestInvoker.submitRequest(new TranscriptRequest(studentName));
        requestInvoker.submitRequest(new IdCardRequest(studentName));
        requestInvoker.submitRequest(new CertificateRequest(studentName));
        requestInvoker.submitRequest(new LibraryCardRequest(studentName));
        requestInvoker.showHistory();
    }
}
