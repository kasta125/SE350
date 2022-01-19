package com.company;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Flight {
    Main.Airline airline;
    Main.Airport origin;
    Main.Airport destination;
    String flightNumber;
    Date departureTime;

    public Flight(Airline airline, Airport origin, Airport destiniation, String flightNumber, Date departureTime){
        setNumber(flightNumber);
        setDepart(departureTime);
    }

    public void setNumber(String flightNumber){
        if(flightNumber != null) {
            this.flightNumber = UUID.randomUUID();
        }
    }

    public void setDepart(Date departureTime){
        if(departureTime != null){
            this.departureTime = Date();
        }
    }

    @Override
    public String toString() {
        return "Flight info, airline=" + airline +
                ", origin=" + origin +
                ", destination=" + destination +
                ", flightNumber='" + flightNumber  +
                ", and departureTime=" + departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(airline, flight.airline) && Objects.equals(origin, flight.origin) && Objects.equals(destination, flight.destination) && Objects.equals(flightNumber, flight.flightNumber) && Objects.equals(departureTime, flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }
}
