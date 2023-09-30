package org.example;

import java.time.LocalDate;

public class Password {
    private String passportNumber;
    private String fullName;
    private LocalDate dateOfBirth;
    private String nationality;
    private LocalDate expirationDate;

    public Password(String passportNumber,
                    String fullName,
                    LocalDate dateOfBirth,
                    String nationality,
                    LocalDate expirationDate) {
        this.passportNumber = passportNumber;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.expirationDate = expirationDate;
    }

    public void displayPassportInfo(){
        System.out.println("Passport Information:");
        System.out.println("Passport Number: " + passportNumber);
        System.out.println("Full Name:       " + fullName);
        System.out.println("Date of Birth:   " + dateOfBirth);
        System.out.println("Nationality:     " + nationality);
        System.out.println("Expiration Date: " + expirationDate);
    }
}
