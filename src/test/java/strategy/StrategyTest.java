package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void testKhaltiPayment() {
        PaymentStrategy payment = new KhaltiPayment();
        assertDoesNotThrow(() -> payment.pay(1500));
    }

    @Test
    void testESewaPayment() {
        PaymentStrategy payment = new ESewaPayment();
        assertDoesNotThrow(() -> payment.pay(2000));
    }

    @Test
    void testBankTransferPayment() {
        PaymentStrategy payment = new BankTransferPayment();
        assertDoesNotThrow(() -> payment.pay(5000));
    }

    @Test
    void testContextSwitchesStrategy() {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new KhaltiPayment());
        assertDoesNotThrow(() -> context.executePayment(1000));
        context.setPaymentStrategy(new ESewaPayment());
        assertDoesNotThrow(() -> context.executePayment(2000));
    }

    @Test
    void testContextWithNoStrategy() {
        PaymentContext context = new PaymentContext();
        assertDoesNotThrow(() -> context.executePayment(1000));
    }

    @Test
    void testPaymentImplementsStrategy() {
        assertTrue(new KhaltiPayment() instanceof PaymentStrategy);
        assertTrue(new ESewaPayment() instanceof PaymentStrategy);
        assertTrue(new BankTransferPayment() instanceof PaymentStrategy);
    }
}
