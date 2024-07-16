import java.util.Date;


public class TicketManagementSystem {

    public static void main(String[] args) {

        PlaneTicket planeTicket = new PlaneTicket("PT001", "Long", "Ha Noi", "USA", new Date(), "Business", 30.0, 20.0);
        TrainTicket trainTicket = new TrainTicket("TT001", "Ky", "Sai Gon", "Singapore", new Date(), "Hard seat","Fast Train");
        BusTicket busTicket = new BusTicket("BT001", "Duy", "Da Nang", "Thailand", new Date(), "VIP", 300);

        System.out.println(planeTicket);
        PaymentProcess.processPayment(planeTicket,"Credit Card");
        System.out.println(trainTicket);
        PaymentProcess.processPayment(trainTicket,"PayPal");
        System.out.println(busTicket);
        PaymentProcess.processPayment(busTicket,"Master Card");
    }
}