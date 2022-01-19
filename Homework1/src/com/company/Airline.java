package com.company;

import java.util.Objects;

public class Airline {
    public String name;

    public Airline(String name){
        setName(name);
    }

    public void setName(String name) {
        if(name != null && name.length() == 8) {
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
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
