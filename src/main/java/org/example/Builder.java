package org.example;

public class Builder extends Human{
    private String specialization;
    public Builder(String name, int age, String address, String specialization) {
        super(name, age, address);
        this.specialization = specialization;
    }

    public void build() {
        System.out.println(getName() + " is building something as a " + specialization + " builder.");
    }
}
