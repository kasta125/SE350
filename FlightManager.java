import airline.Airline;
import airport.Airport;
import flight.Flight;
import flight.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public final class FlightManager {

    private static FlightManager fmInstance;

    private static List<Flight> flights;
    //List flights = new List[];

    //Main.Airline airline;

    public static FlightManager getInstance() throws Exception {
        if (fmInstance == null)
            fmInstance = new FlightManager();

        return fmInstance;
    }

    private FlightManager() {
        flights = new ArrayList<Flight>();
    }

    public String createFlight(String type, Airline airline, Airport origin, Airport destination) {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination);
        flights.add(flight);

        return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }

    /*
    public void createFlight(){
        Airline comp = Airline.toString();
        Airport city = Airport.toString();
        CommericalFlight flightInfo = Flight.toString();
        List flight = new List[comp, city, flightInfo];
        flights.append(flight);
    }

    public void getFlightByNumber(Flight flightNum){
        for (int i  = 0,  i >= flights.length, i++){
            if(flightNum == flights[i][2]) {
                return flight[i];
            }


        flights.stream().filter(flight -> )
        }

    }

     */
}