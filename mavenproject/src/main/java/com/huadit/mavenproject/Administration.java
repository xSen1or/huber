/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huadit.mavenproject;
import static com.huadit.mavenproject.Mavenproject.clients;
import static com.huadit.mavenproject.Mavenproject.drivers;

import java.util.Scanner; 

/**
 *
 * @author jimma
 */

public class Administration {
    static Scanner sc = new Scanner(System.in); 
        
    private String adminUsername;
    private String adminPassword;
    private String adminEmail; 

    public Administration(String adminUsername, String adminPassword, String adminEmail) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.adminEmail = adminEmail; 
    }
    
    public void setAdminUsername(String newAdminUsername) {
        this.adminUsername = newAdminUsername;
    }
    public void setAdminPassword(String newAdminPassword){
        this.adminPassword = newAdminPassword;
    }
    public void setAdminEmail(String newAdminEmail) {
        this.adminEmail = newAdminEmail;
    }
    
    public String getAdminUsername() {
        return adminUsername;
    }    
    public String getAdminPassword() {
        return adminPassword;
    }
    public String getAdminEmail() {
        return adminEmail; 
    }
    
    public static void displayClientsList() {
        int clientCount = 0; 
        for (Clients client : clients ) {
            clientCount++; 
            System.out.println("Client #"+clientCount+ "\nClient Username: " + client.getClientName() + "\nClient Password: " + client.getClientPassword() + "\n Client Email Address: " + client.getClientEmail() + "\nClient Home Address: " + client.getClientAddress() + "Client Phone Number: " + client.getClientPhone() + "\n Client Total Routes: " + client.getClientTotalRoutes());
        }
    }
    
    public static void displayDriversList() {
        for (Driver driver : drivers) {
            System.out.println(driver.toString()); 
        }
    }
    
    public static void removeDriver() {
        String targetDriver = sc.nextLine(); 
        boolean found = false;  
        do {
            for (Driver driver : drivers) {
               if (targetDriver.equals(driver.getDriverName())) {
                   found = true; 
                   drivers.remove(driver); 
               }
            }
        } while (!found);
    }
}

