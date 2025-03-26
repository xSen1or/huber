package com.huadit.mavenproject;

import java.util.*; 


public class Driver {
    private String driverName;
    private String driverPassword;
    private String driverEmail;
    private String driverAddress;
    private int driverPhone;
    private String driverTaxNumber;
    private int driverID;
    private boolean driverAvailability;
    private List<Integer> driverRating; 

    public Driver(String driverName, String driverPassword, String driverEmail, String driverAddress, int driverPhone, String driverTaxNumber, int driverID, boolean driverAvailability, List<Integer> driverRating) {
        this.driverName = driverName;
        this.driverPassword = driverPassword;
        this.driverEmail = driverEmail;
        this.driverAddress = driverAddress;
        this.driverPhone = driverPhone;
        this.driverTaxNumber = driverTaxNumber;
        this.driverID = driverID;
        this.driverAvailability = true;
        this.driverRating = new ArrayList<>();
    }

    public static List<Driver> drivers = new ArrayList<>(); 
    /*
        Getters and Setter
    */

    public String getDriverName() {
        return driverName;
    }
    public String getDriverPassword() {
        return driverPassword;
    }
    public String getDriverEmail() {
        return driverEmail;
    }
    public String getDriverAddress() {
        return driverAddress;
    }
    public int getDriverPhone() {
        return driverPhone;
    }
    public String getDriverTaxNumber() {
        return driverTaxNumber;
    }
    public int getDriverID() {
        return driverID;
    }
    public boolean getDriverAvailability() {
        return driverAvailability;
    }
       
    public void setDriverName(String newDriverName) {
        driverName = newDriverName;
    }
    public void setDriverPassword(String newDriverPassword) {
        driverPassword = newDriverPassword;
    }
    public void setDriverEmail(String newDriverEmail) {
        driverEmail = newDriverEmail;
    }
    public void setDriverAddress(String newDriverAddress) {
        driverAddress = newDriverAddress;
    }
    public void setDriverPhone(int newDriverPhone) {
        driverPhone = newDriverPhone;
    }
    public void setDriverTaxNumber(String newDriverTaxNumber) {
        driverTaxNumber = newDriverTaxNumber;
    }
    public void setDriverID(int newDriverID) {
        driverID = newDriverID;
    }
    public void setDriverAvailability(boolean newDriverAvailability) {
        driverAvailability = newDriverAvailability;
    }  

    public void addDriverRating(int rating) {
        driverRating.add(rating); 
    }
    
    public float getDriverAverageRating() {
        int sumOfRatings = 0;
        for (int i = 0; i < driverRating.size(); i++) {
            sumOfRatings += driverRating.get(i);
        } 
        return (sumOfRatings/driverRating.size()); 
    }
}
