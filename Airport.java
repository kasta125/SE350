import java.util.Locale;
import java.util.Objects;

public class Airport {
    public String name;

    public Airport(String name){
        setName(name);
    }

    public void setName(String name) {
        if(name != null && name.length() == 3 && name == name.toUpperCase()) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
