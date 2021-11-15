package com.nitay;

import java.time.LocalDate;

public class DriverLicense {
    DriverLicense(String driverName, LocalDate expiryDate, boolean isSuspended){
        this.driverName = driverName;
        this.expiryDate = expiryDate;
        this.isSuspended = isSuspended;
    }
    private String driverName;
    private LocalDate expiryDate;
    private boolean isSuspended;

    public boolean isExpired(){
        if (expiryDate.compareTo(LocalDate.now())<0){
            return true;
        }
        return false;
    }
}
