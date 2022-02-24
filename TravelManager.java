public class TravelManager {
    public static void main(String[] args){
        //FlightManager
        //Airline comp = Airline.toString();
        //Airport city = Airport.toString();
        //Flight flightInfo = Flight.toString();
        //System.out.println('Airline: '+ comp + '\nAirport: '+ city + '\nFlight: '+ flightInfo);

        FlightManager flightManagerP = FlightManager.createFlight("passangerFlight",Virgin,Midway,Tampa);
        FlightManager flightManagerC = FlightManager.createFlight("commericalFlight",Turkish,Ohare,JFK);
        System.out.println(flightManagerP);
        System.out.println(flightManagerC);
    }
}
