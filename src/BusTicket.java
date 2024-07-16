import java.util.Date;

class BusTicket extends Ticket {
    private String busType;
    private double distance;

    public BusTicket(String ticketID, String passengerName, String origin, String destination, Date departureDateTime, String busType, double distance) {
        super(ticketID, passengerName, origin, destination, departureDateTime);
        this.busType = busType;
        this.distance = distance;
    }


    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Bus Type: " + busType + "\n" +
                "Distance: " + distance + "\n" +
                "Total Price: " + calculatePrice();
    }

    @Override
    public double calculatePrice() {

        double basePricePerKm = 0.5; // Example base price per kilometer
        double busMultiplier = 1.0;

        switch (busType) {
            case "Regular":
                busMultiplier = 1.0;
                break;
            case "VIP":
                busMultiplier = 1.5;
                break;
        }

        return basePricePerKm * distance * busMultiplier;
    }
}
