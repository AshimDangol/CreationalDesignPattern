package strategy.bad;

// Bad design: payment logic is hardcoded with if-else chains
// Adding a new payment method requires modifying this class (violates Open/Closed)
public class FeeProcessorBad {

    // Hardcoded branching — every new payment method means another else-if
    public void processFee(String method, double amount) {
        if ("KHALTI".equalsIgnoreCase(method)) {
            System.out.println("Paid NPR " + amount + " via Khalti");
        } else if ("ESEWA".equalsIgnoreCase(method)) {
            System.out.println("Paid NPR " + amount + " via eSewa");
        } else if ("BANK".equalsIgnoreCase(method)) {
            System.out.println("Paid NPR " + amount + " via Bank Transfer");
        } else {
            System.out.println("Unknown payment method: " + method);
        }
    }
}
