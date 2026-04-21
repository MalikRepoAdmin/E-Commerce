// CheckoutService.java
public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    // Dependency Injection
    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void completeOrder(double total) {
        paymentProcessor.processPayment(total);
    }
}