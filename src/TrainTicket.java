import java.util.Date;
public class TrainTicket extends Ticket {
    private String seatType;
    private String trainType;

    public TrainTicket(String ticketID, String passengerName, String origin, String destination, Date depatureDatetime, String seatType, String trainType) {
        super(ticketID, passengerName, origin, destination, depatureDatetime);
        this.seatType = seatType;
        this.trainType = trainType;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }
    public String toString() {
        return super.toString() + "\n" +
                "Seat Type: " + seatType + "%" + "\n" +
                "Train Type: " + trainType + "\n" +
                "Total Price: " + calculatePrice();
    }

    @Override
    public double calculatePrice() {
        double trainPrice = 0;
        double seatPrice = 0;
        switch (seatType) {
            case "Hard seat":
                seatPrice = 60;
                break;
            case "Soft seat":
                seatPrice = 75;
                break;
            case "Lower deck seat":
                seatPrice = 100;
                break;
        }
        switch (trainType) {
            case "Normal Train":
                trainPrice = 100;
                break;
            case "Fast Train":
                trainPrice = 150;
                break;
        }
        return trainPrice + seatPrice;

    }
}
