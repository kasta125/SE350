import Main.CommericalFlight Flight;
import Main.PassengerFlight Flight;

public class FlightFactory {

    private FlightFactory() {}

    private static Map<Type,Airline, Airport, Flight> flightCache = new HashMap<>();

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }
        if (type.equals("passengerFlight")) {
            try {
                return new PassengerFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }
        else {
            return null;
        }
    }

    public static Flight getFlight(String type) {
        return flightCache.computeIfAbsent(type, newType -> {
            return new Flight(type);
        });
    }

    /*
    public static Flight createFlight(String type){
        if type.equals("commericalFlight"){
            return new CommericalFlight();
        }
        else if type.equals("passengerFlight"){
            return new PassengerFlight();
        }
        else{
            return null;
        }
    }

     */
}