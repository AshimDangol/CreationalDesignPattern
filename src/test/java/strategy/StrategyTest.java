package strategy;

import java.util.Scanner;

public class StrategyTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Strategy Test ===");

        System.out.print("Enter amount for Khalti payment: ");
        double khaltiAmount = scanner.nextDouble();
        scanner.nextLine();
        testKhaltiPayment(khaltiAmount);

        System.out.print("Enter amount for eSewa payment: ");
        double esewaAmount = scanner.nextDouble();
        scanner.nextLine();
        testESewaPayment(esewaAmount);

        System.out.print("Enter amount for Bank Transfer payment: ");
        double bankAmount = scanner.nextDouble();
        scanner.nextLine();
        testBankTransferPayment(bankAmount);

        System.out.print("Enter amount for strategy switching test: ");
        double switchAmount = scanner.nextDouble();
        scanner.nextLine();
        testContextSwitchesStrategy(switchAmount);

        testPaymentImplementsStrategy();

        scanner.close();
    }

    static void testKhaltiPayment(double amount) {
        PaymentStrategy payment = new KhaltiPayment();
        try {
            payment.pay(amount);
            System.out.println("PASS: Khalti payment executed");
        } catch (Exception e) {
            System.out.println("FAIL: Khalti payment threw exception - " + e.getMessage());
        }
    }

    static void testESewaPayment(double amount) {
        PaymentStrategy payment = new ESewaPayment();
        try {
            payment.pay(amount);
            System.out.println("PASS: eSewa payment executed");
        } catch (Exception e) {
            System.out.println("FAIL: eSewa payment threw exception - " + e.getMessage());
        }
    }

    static void testBankTransferPayment(double amount) {
        PaymentStrategy payment = new BankTransferPayment();
        try {
            payment.pay(amount);
            System.out.println("PASS: Bank Transfer payment executed");
        } catch (Exception e) {
            System.out.println("FAIL: Bank Transfer payment threw exception - " + e.getMessage());
        }
    }

    static void testContextSwitchesStrategy(double amount) {
        PaymentContext context = new PaymentContext();
        try {
            context.setPaymentStrategy(new KhaltiPayment());
            context.executePayment(amount);
            context.setPaymentStrategy(new ESewaPayment());
            context.executePayment(amount);
            System.out.println("PASS: Context switches strategy at runtime");
        } catch (Exception e) {
            System.out.println("FAIL: Context switching failed - " + e.getMessage());
        }
    }

    static void testPaymentImplementsStrategy() {
        if (new KhaltiPayment() instanceof PaymentStrategy
                && new ESewaPayment() instanceof PaymentStrategy
                && new BankTransferPayment() instanceof PaymentStrategy) {
            System.out.println("PASS: All payments implement PaymentStrategy interface");
        } else {
            System.out.println("FAIL: Some payment does not implement PaymentStrategy");
        }
    }
}
