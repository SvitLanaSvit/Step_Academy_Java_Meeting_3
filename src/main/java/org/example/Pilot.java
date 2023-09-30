package org.example;

public class Pilot extends Human{
    private String aircraftName;

    public Pilot(String name, int age, String address, String aircraftName) {
        super(name, age, address);
        this.aircraftName = aircraftName;
    }
    public void fly() {
        System.out.println(getName() + " is flying the aircraft named " + aircraftName + ".");
    }

}
