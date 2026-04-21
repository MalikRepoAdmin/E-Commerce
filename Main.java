public class Main {
    public static void main(String[] args) {

        // CheckoutService with support for various payment method
        // via dependency injection and factory design pattern
        // Example: User choose Bank Transfer
        PaymentProcessor bank = new BankTransfer();
        CheckoutService checkout1 = new CheckoutService(bank);
        checkout1.completeOrder(150.00);

        System.out.println("-------------------------");

        // Example: User choose GoPay
        PaymentProcessor gopay = new EWallet("GoPay");
        CheckoutService checkout2 = new CheckoutService(gopay);
        checkout2.completeOrder(75.50);

        System.out.println("-------------------------");

        // Example: User choose OVO
        PaymentProcessor ovo = new EWallet("OVO");
        CheckoutService checkout3 = new CheckoutService(ovo);
        checkout3.completeOrder(50.50);

        System.out.println("-------------------------");

        // Example: User choose ShopeePay
        PaymentProcessor shoopepay = new EWallet("ShopeePay");
        CheckoutService checkout4 = new CheckoutService(shoopepay);
        checkout4.completeOrder(200.30);
    }
}