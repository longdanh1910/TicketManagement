public class PaymentProcess {
    public static void processPayment(Ticket ticket, String paymentMethod) {
        double price = ticket.calculatePrice();

        System.out.println("Processing Payment of $" + price + " using" + paymentMethod);
    }
}
