package strategy;

// Strategy pattern: defines a family of interchangeable payment algorithms
// Each concrete strategy encapsulates one payment method
public interface PaymentStrategy {
    void pay(double amount);
}
