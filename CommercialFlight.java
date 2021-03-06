import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import Main.Airline airline;

public class CommericalFlight implements Flight {
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;

    public CommericalFlight(Airline airline, Airport origin, Airport destiniation) throws NullParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime();
    }

    private void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }

    private void setDepartureTime() {
        this.departureTime = new Date(2022, 05, 05, 13, 30);
    }

    private void setDestination(Airport destination) throws NullParameterException {
        if (destination == null) {
            throw new NullParameterException("Destination cannot be null.");
        }
        this.destination = destination;
    }

    private void setOrigin(Airport origin) throws NullParameterException {
        if (origin.equals(null)) {
            throw new NullParameterException("Origin cannot be null.");
        }
        this.origin = origin;
    }

    private void setAirline(Airline airline) throws NullParameterException {
        if (airline.equals(null)) {
            throw new NullParameterException(("Airline cannot be null"));
        }
        this.airline = airline;
    }

    public String getAirline() {
        return airline.toString();
    }

    public String getOrigin() {
        return origin.toString();
    }

    public String getDestination() {
        return destination.toString();
    }

    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }

    /*
    public void setFlightNumber(String flightNumber){
        if(flightNumber != null) {
            this.flightNumber = UUID.randomUUID();
        }
    }

    public void setDepartureTime(Date departureTime){
        if(departureTime != null){
            this.departureTime = Date();
        }
    }
    */

    @Override
    public String toString() {
        return "Flight info, airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber='" + getFlightNumber() +
                ", and departureTime=" + getDepartureTime();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(airline, flight.airline) &&
                Objects.equals(origin, flight.origin) &&
                Objects.equals(destination, flight.destination) &&
                Objects.equals(flightNumber, flight.flightNumber) &&
                Objects.equals(departureTime, flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }
}
