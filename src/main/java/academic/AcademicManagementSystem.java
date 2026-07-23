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

public class AcademicManagementSystem {
    private ApplicationContext appContext;
    private PaymentContext paymentContext;
    private ResultPublisher resultPublisher;
    private ServiceRequestInvoker requestInvoker;

    public AcademicManagementSystem() {
        this.appContext = new ApplicationContext();
        this.paymentContext = new PaymentContext();
        this.resultPublisher = new ResultPublisher();
        this.requestInvoker = new ServiceRequestInvoker();
    }

    public void processApplication() {
        System.out.println("--- Application Lifecycle (State) ---");
        while (!"Enrolled".equals(appContext.getCurrentState()) && !"Rejected".equals(appContext.getCurrentState())) {
            System.out.println("State: " + appContext.getCurrentState());
            appContext.next();
        }
        System.out.println("Final state: " + appContext.getCurrentState());
    }

    public void rejectApplication() {
        appContext.reject();
    }

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

    public void publishResults(String studentName, String parentName, String department) {
        System.out.println("\n--- Result Publication (Observer) ---");
        resultPublisher.addObserver(new StudentNotifier(studentName));
        resultPublisher.addObserver(new ParentNotifier(parentName));
        resultPublisher.addObserver(new DepartmentNotifier(department));
        resultPublisher.publishResults(studentName);
    }

    public void requestService(String studentName) {
        System.out.println("\n--- Service Requests (Command) ---");
        requestInvoker.submitRequest(new TranscriptRequest(studentName));
        requestInvoker.submitRequest(new IdCardRequest(studentName));
        requestInvoker.submitRequest(new CertificateRequest(studentName));
        requestInvoker.submitRequest(new LibraryCardRequest(studentName));
        requestInvoker.showHistory();
    }
}
