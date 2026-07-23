package command.demo;

import command.CertificateRequest;
import command.IdCardRequest;
import command.LibraryCardRequest;
import command.ServiceRequestInvoker;
import command.TranscriptRequest;

public class CommandDemo {
    public static void main(String[] args) {
        ServiceRequestInvoker invoker = new ServiceRequestInvoker();

        invoker.submitRequest(new TranscriptRequest("Ram"));
        invoker.submitRequest(new IdCardRequest("Ram"));
        invoker.submitRequest(new CertificateRequest("Ram"));
        invoker.submitRequest(new LibraryCardRequest("Ram"));

        invoker.showHistory();
    }
}
