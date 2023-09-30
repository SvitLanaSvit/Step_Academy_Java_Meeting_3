package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ForeignPassport extends Password{
    private String foreignPassportNumber;
    private List<Visa> visas;

    public ForeignPassport(String passportNumber,
                           String fullName,
                           LocalDate dateOfBirth,
                           String nationality,
                           LocalDate expirationDate,
                           String foreignPassportNumber) {
        super(passportNumber, fullName, dateOfBirth, nationality, expirationDate);
        this.foreignPassportNumber = foreignPassportNumber;
        this.visas = new ArrayList<>();
    }

    public void addVisa(Visa visa){
        visas.add(visa);
    }

    public void displayForeignPassportInfo(){
        displayPassportInfo();
        System.out.println("Foreign Passport Number: " + foreignPassportNumber);
        System.out.println("Visas:");
        for (Visa visa : visas) {
            visa.displayVisaInfo();
        }
    }
}
