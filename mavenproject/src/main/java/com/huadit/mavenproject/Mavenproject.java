/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.huadit.mavenproject;

// Clients File imports.
import static com.huadit.mavenproject.Clients.addClient;
import static com.huadit.mavenproject.Clients.clientLogin;
import static com.huadit.mavenproject.Clients.clientSignUp;

// Administration File imports.
import static com.huadit.mavenproject.Administration.removeDriver;
import static com.huadit.mavenproject.Administration.displayClientsList;
import static com.huadit.mavenproject.Administration.displayDriversList;

//Routes File imports.
import static com.huadit.mavenproject.Routes.addRoute;
import static com.huadit.mavenproject.Routes.routesList;

import java.util.List;
import java.util.Scanner;
/**
 *
 * @author jimma
 */
public class Mavenproject {

    static Scanner sc = new Scanner(System.in);
    static List<Clients> clients = Clients.clientsList;
    static List<Driver> drivers = Driver.drivers;
    static List<Routes> routes = Routes.routesList;
    static Administration admin = new Administration("pumaloc0", "1312", "testemail@example.com"); 
     
    
    public static String[] addElement(String[] arr, String element) {
        String[] tempArr = new String[arr.length + 1]; 
        System.arraycopy(arr, 0, tempArr, 0, arr.length);
        tempArr[arr.length+1] = element; 
        
        System.out.println("addElement Debugging: ");
        for (String x : tempArr ) {
            System.out.println(x); 
        }
        
        return tempArr; 
    }
    
    
    public static void testClients() {
        addClient(new Clients("Giannhs Parios", "parios1312", "giannhsParios@gmail.com", "Adrianeioy 24 N.Psyxiko", 694702091, 23)); 
    }
    
    public static void main(String[] args) {
        testClients(); 
        // String clientName, String clientPassword, String clientEmail, String clientAddress, int clientPhone, int clientTotalOrder
        System.out.println("Welcome to HUBER! \nCreate or Login to your account!");

        if (sc.nextLine().toLowerCase().contains("create")) {
//            String signUpUsername = clientSignUp(); 
        } else if (sc.nextLine().toLowerCase().contains("login")) {
            String[] loginValues = clientLogin(); 
            String targetClientUsername = loginValues[0];
            String targetClientPassword = loginValues[1]; // I don't know if this is nexcessery, we will see in the future.
            // There is no reason to check if the given values exists in the database since the clientLogin() function already did this for us. 
            if (admin.getAdminUsername().equals(targetClientUsername) && admin.getAdminPassword().equals(targetClientPassword)) {
               //Will add admin futures later.
               boolean using_the_menu = true;
               while(using_the_menu) {
                  System.out.println("Administration menu\n1.Display Clients List\n2.Display Drivers List\n3.Remove Driver");
//                  String admin_option = sc.nextLine();
               }
            } else { 
          
            }
        }
    }
}
