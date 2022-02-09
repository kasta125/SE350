public class TravelManager {
    public static void main(String[] args){
        //FlightManager
        //Airline comp = Airline.toString();
        //Airport city = Airport.toString();
        //Flight flightInfo = Flight.toString();
        //System.out.println('Airline: '+ comp + '\nAirport: '+ city + '\nFlight: '+ flightInfo);

        FlightManager flightManager = FlightManager.createFlight();
        System.out.println(flightManager);
    }
}
