package facade;

// Subsystem component — sends a welcome message after successful registration
public class WelcomeMessageSender {
    public void sendWelcome(String name) {
        System.out.println("Welcome " + name + "! Registration successful.");
    }
}
