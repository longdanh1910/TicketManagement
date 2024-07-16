import java.util.Date;
class PlaneTicket extends Ticket{
    private String seatClass; // Economy, Business, First Class
    private double luggageFee;
    private double serviceFee;

    public PlaneTicket(String ticketID, String passengerName, String origin, String destination, Date departureDateTime, String seatClass, double luggageFee, double serviceFee) {
        super(ticketID, passengerName, origin, destination, departureDateTime);
        this.seatClass = seatClass;
        this.luggageFee = luggageFee;
        this.serviceFee = serviceFee;
    }


    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public double getLuggageFee() {
        return luggageFee;
    }

    public void setLuggageFee(double luggageFee) {
        this.luggageFee = luggageFee;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }
    public String toString() {
        return super.toString() + "\n" +
                "Seat Class: " + seatClass + "\n" +
                "Luggage Fee: " + luggageFee + "\n" +
                "Service Fee: " + serviceFee + "\n" +
                "Total Price: " + calculatePrice();
    }

    @Override
    public double calculatePrice() {

        double basePrice = 100.0; // Example base price
        double classMultiplier = 1.0;

        switch (seatClass) {
            case "Economy":
                classMultiplier = 1.0;
                break;
            case "Business":
                classMultiplier = 1.5;
                break;
            case "First Class":
                classMultiplier = 2.0;
                break;
        }

        return basePrice * classMultiplier + luggageFee + serviceFee;
    }
}
