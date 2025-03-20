/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.huadit.mavenproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jimma
 */
public class Mavenproject {

    static Clients client = new Clients();
    static Driver driver = new Driver();
    static Scanner sc = new Scanner(System.in);

    static List<Clients> clients = Clients.clientsList;
    static List<Driver> drivers = Driver.drivers;

    public static void main(String[] args) {
        // String clientName, String clientPassword, String clientEmail, String clientAddress, int clientPhone, int clientTotalOrder
        clients.add(new Clients());

        System.out.println("Welcome to HUBER! \nCreate or Login to your account!");
        if (sc.nextLine().toLowerCase().contains("create")) {
            client.clientSignUp();
        } else if (sc.nextLine().toLowerCase().contains("login")) {
            client.clientLogin();
        }
    }
}
