package command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    void testTranscriptRequest() {
        ServiceRequest request = new TranscriptRequest("Ram");
        assertDoesNotThrow(() -> request.execute());
    }

    @Test
    void testIdCardRequest() {
        ServiceRequest request = new IdCardRequest("Ram");
        assertDoesNotThrow(() -> request.execute());
    }

    @Test
    void testCertificateRequest() {
        ServiceRequest request = new CertificateRequest("Ram");
        assertDoesNotThrow(() -> request.execute());
    }

    @Test
    void testLibraryCardRequest() {
        ServiceRequest request = new LibraryCardRequest("Ram");
        assertDoesNotThrow(() -> request.execute());
    }

    @Test
    void testInvokerProcessesRequests() {
        ServiceRequestInvoker invoker = new ServiceRequestInvoker();
        assertDoesNotThrow(() -> {
            invoker.submitRequest(new TranscriptRequest("Ram"));
            invoker.submitRequest(new IdCardRequest("Ram"));
        });
    }

    @Test
    void testRequestImplementsServiceRequest() {
        assertTrue(new TranscriptRequest("Ram") instanceof ServiceRequest);
        assertTrue(new IdCardRequest("Ram") instanceof ServiceRequest);
        assertTrue(new CertificateRequest("Ram") instanceof ServiceRequest);
        assertTrue(new LibraryCardRequest("Ram") instanceof ServiceRequest);
    }
}
