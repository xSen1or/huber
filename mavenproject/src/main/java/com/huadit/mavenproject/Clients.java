package com.huadit.mavenproject;
import java.util.*; 
/**
 *
 * @author jimma
 */


public class Clients {
    private String clientName;
    private String clientPassword;
    private String clientEmail;
    private String clientAddress;
    private int clientPhone;
    private int clientTotalRoutes;

    public void Client(String clientName, String clientPassword, String clientEmail, String clientAddress, int clientPhone, int clientTotalOrders) {
        this.clientName = clientName;
        this.clientPassword = clientPassword;
        this.clientEmail = clientEmail;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.clientTotalRoutes = clientTotalOrders;
    }

    public static List<Clients> clientsList = new ArrayList<>();
    //Getters
    public String getClientName() {
        return clientName;
    }
    public String getClientPassword() {
        return clientPassword;
    }
    public String getClientEmail() {
        return clientEmail;
    }
    public String getClientAddress() {
        return clientAddress;
    }
    public int getClientPhone() {
        return clientPhone;
    }
    public int getClientTotalOrders() {
        return clientTotalRoutes;
    }


    //Setters
    public void setClientName(String newName) {
        this.clientName = newName;
    }
    public void setClientPassword(String newPassword) {
        this.clientPassword = newPassword;
    }
    public void setClientEmail(String newEmail) {
        this.clientEmail = newEmail;
    }
    public void setClientAddress(String newAddress) {
        this.clientAddress = newAddress;
    }
    public void setClientPhone(int newPhone) {
        this.clientPhone = newPhone;
    }
    public void setClientTotalOrders(int newTotalOrders) {
        this.clientTotalRoutes = newTotalOrders;
    }

    public void clientLogin() { 
        System.out.println("This is the clientLogin function inside the Client.java file");
    }
    
    public void clientSignUp() {
        Clients newClient = new Clients();      
        
    
    }
}

   