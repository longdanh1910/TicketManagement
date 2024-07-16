import java.util.Date;
public abstract class Ticket {
    private String ticketID;
    private String passengerName;
    private String origin;
    private String destination;
    private Date depatureDatetime;

    public Ticket(String ticketID,String passengerName,String origin,String destination,Date depatureDatetime){
        this.ticketID=ticketID;
        this.passengerName=passengerName;
        this.origin=origin;
        this.destination=destination;
        this.depatureDatetime=depatureDatetime;
    }

    public String getTicketID(){
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public Date getDepatureDatetime() {
        return depatureDatetime;
    }
    public void setDepatureDatetime(Date depatureDatetime) {
        this.depatureDatetime = depatureDatetime;
    }

    public String toString() {
        return "Ticket ID: " + ticketID + "\n" +
                "Passenger Name: " + passengerName + "\n" +
                "Origin: " + origin + "\n" +
                "Destination: " + destination + "\n" +
                "Departure DateTime: " + depatureDatetime;
    }
    public abstract double calculatePrice();
}
