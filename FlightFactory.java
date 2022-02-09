import Main.CommericalFlight Flight;

public class FlightFactory {

    private FlightFactory() {}

    public static Flight createFlight(String type){
        if type.equals("Commerical Flight"){
            return new CommericalFlight();
        }
        else{
            return null;
        }
    }
}