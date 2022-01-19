package com.company;

import java.time.LocalDateTime;
import java.util.Date;
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


}
