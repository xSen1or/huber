package com.huadit.mavenproject;

import static com.huadit.mavenproject.Mavenproject.clients;
import static com.huadit.mavenproject.Mavenproject.drivers;
import static com.huadit.mavenproject.Routes.addRoute;


import java.util.*;
import java.util.concurrent.*;

/**
 *
 * @author jimma
 */
public class Clients {
    
    static Scanner sc = new Scanner(System.in);

    private String clientName;
    private String clientPassword;
    private String clientEmail;
    private String clientAddress;
    private int clientPhone;
    private int clientTotalRoutes;

    public Clients(String clientName, String clientPassword, String clientEmail, String clientAddress, int clientPhone, int clientTotalRoutes) {
        this.clientName = clientName;
        this.clientPassword = clientPassword;
        this.clientEmail = clientEmail;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.clientTotalRoutes = clientTotalRoutes;
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

    public int getClientTotalRoutes() {
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

    public void setClientTotalRoutes(int newTotalRoutes) {
        this.clientTotalRoutes = newTotalRoutes;
    }

    public static void addClient(Clients client) {
        clientsList.add(client);
    }

    public static String[] clientLogin() {
        String targetUsername = null;
        String targetPassword = null;
        System.out.println("Username: ");

        // Search inside the clients list for the given name. 
        // Verification Proccess 
        boolean found = false;
        do {
            String givenName = sc.nextLine();
            for (Clients client : clients) {
                if (givenName.equalsIgnoreCase(client.getClientName())) {
                    targetUsername = client.getClientName();
                    found = true;
                    System.out.println("Password: ");
                    String givenPassword = sc.nextLine();
                    if (givenPassword.equals(client.getClientPassword())) {
                        System.out.println("Login Successful");
                    } else {
                        int tries = 3;
                        do {
                            System.out.println("Invalid Password. Please try again ( " + tries + " Tries Remaining)");
                            System.out.println("Password: ");
                            givenPassword = sc.nextLine();
                        } while (tries > 0 || !givenPassword.equals(client.getClientPassword()));
                        if (tries <= 0) {
                            System.out.println("Maxed out attempts");
                            System.exit(0);
                        }
                    }
                    break;
                }
            }
            if (!found) {
                System.out.print("The Username or Password is Incorrect. Please try again.\nUsername: ");
                givenName = sc.nextLine();
            }
        } while (!found);
        String[] returnedValues = {targetUsername, targetPassword};
        return returnedValues;
    }

    static ArrayList<String> answers = new ArrayList<>();

    public static String clientSignUp() {
        String[] questions = {"Username: ", "Password: ", "Email: ", "Home Address: : "};
        for (String question : questions) {
            System.out.println("Submit your " + question);
            String element = sc.nextLine();
            answers.add(element);
        }
        System.out.println("Phone Number: ");
        int clientx_phonenumber = sc.nextInt();

        //String clientName, String clientPassword, String clientEmail, String clientAddress, int clientPhone, int clientTotalOrders
        addClient(new Clients(answers.get(0), answers.get(1), answers.get(2), answers.get(3), clientx_phonenumber, 0));
        return answers.get(0);
    }

  
    public static void displayStars(Driver targetDriver) {
        float count = targetDriver.getDriverAverageRating();
        for (int i = 0; i < count; i++) {
            System.out.println("⭐");
        }   
    }

    public static void rateHuber(Driver driver) {
        System.out.println("Rate your HUBER experience with a value of 0-10");
        if (sc.hasNextInt()) {
            while (true) {
                int huberRating = sc.nextInt(); 
                if (huberRating >= 0 && huberRating <= 10) {
                    System.out.println("Thank you for your time helping us!");
                    try {
                        driver.addDriverRating(huberRating); 
                    } catch (Exception e ) {
                        System.out.println("Error found in Clients.java at line 160");
                        System.out.println(e);
                    }
                } else {
                    System.out.println("Invalid Option. \nPlease submit a value between 0-10");
                    huberRating = sc.nextInt();
                }
            }            
        }

    }  


    public static void requestHuber(String clientUsername) {
        //User Menu
        System.out.println("Nice to see you again " + clientUsername);

        String routeEndPoint = sc.nextLine();
        System.out.println("Where are we taking you from?");
        String routeStartPoint = sc.nextLine();
        System.out.println("Heading to " + routeEndPoint + "\nFrom " + routeStartPoint + "\nChecking for available Hubers!");
        for (Driver driver : drivers) {
            if (driver.getDriverAvailability()) {
                System.out.println(driver.getDriverName() + " is on his way to your location.");
                addRoute(new Routes(clientUsername, driver.getDriverName(), routeStartPoint, routeEndPoint, 0));
                driver.setDriverAvailability(false);
                ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
                Random rand = new Random(); 
                int randomTripTime = rand.nextInt(0,10);
                System.out.println("Your HUBER has arrived.\nYour estimated time of arriving is: " + randomTripTime + "minutes");
                scheduler.schedule(() -> System.out.println("test"), randomTripTime, TimeUnit.SECONDS); 
                rateHuber(driver);                 

                break;
            }
        }
    }
   
}
