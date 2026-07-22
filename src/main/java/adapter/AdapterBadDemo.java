package adapter;

// Bad design: client calls the legacy sendMail() directly
// If the system expects sendNotification(), this code breaks — interfaces are incompatible
public class AdapterBadDemo {
    public static void main(String[] args) {
        LegacyEmailService oldService = new LegacyEmailService();
        oldService.sendMail("Welcome to PCPS College");
    }
}
