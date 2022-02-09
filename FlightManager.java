public final class FlightManager {

    private static FlightManager fmInstance;

    List flights = new List[];

    //Main.Airline airline;

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
        }
    }
}