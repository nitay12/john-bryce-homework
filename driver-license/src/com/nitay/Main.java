package com.nitay;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DriverLicense oldLicense = new DriverLicense(
                "Nitay Caspi",
                LocalDate.of(2021,11,1),
                false
        );DriverLicense newLicense = new DriverLicense(
                "Nitay Caspi",
                LocalDate.of(2022,11,1),
                false
        );
        System.out.println(oldLicense.isExpired());
        System.out.println(newLicense.isExpired());
    }
}
