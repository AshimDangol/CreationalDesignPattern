package strategy;

// Context class: holds a reference to a PaymentStrategy and delegates execution
// The strategy can be swapped at runtime without changing the context
public class PaymentContext {
    private PaymentStrategy strategy;

    // Sets the payment strategy to use (called at runtime to switch methods)
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Delegates payment to the currently selected strategy
    public void executePayment(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected");
            return;
        }
        strategy.pay(amount);
    }
}
