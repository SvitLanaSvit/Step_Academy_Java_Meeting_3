package org.example;

public class Human {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public Human(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        String formatString = "|%-35s|%-5s|%-25s|";
        return String.format(formatString, name, age, address);
    }
}
