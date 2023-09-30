package org.example;

public class Sailor extends Human {
    private String shipName;

    public Sailor(String name, int age, String address, String shipName) {
        super(name, age, address);
        this.shipName = shipName;
    }

    public void sail() {
        System.out.println(getName() + " is sailing on the ship named " + shipName + ".");
    }
}
