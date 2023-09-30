package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Visa {
    private String type;
    private String country;
    private LocalDate expirationDate;

    public Visa(String type, String country, LocalDate expirationDate) {
        this.type = type;
        this.country = country;
        this.expirationDate = expirationDate;
    }

    public void displayVisaInfo() {
        System.out.println("Visa Type: " + type);
        System.out.println("Country: " + country);
        System.out.println("Visa Expiration Date: " + expirationDate);
    }
}
