package strategy.bad;

public class FeeProcessorBad {

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
