package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    private Payment paymentPayPal;
    private Payment paymentCreditCard;

    @BeforeEach
    void setUp() {
        paymentPayPal = new PayPalPaymentStrategy();
        paymentCreditCard = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(paymentPayPal.pay(100));
        assertTrue(paymentCreditCard.pay(100));
    }
}