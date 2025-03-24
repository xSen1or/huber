/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huadit.mavenproject;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author jimma
 */
public class Routes {
    private String routeClient;
    private String routeDriver; 
    private String routeStartPoint;
    @SuppressWarnings("FieldMayBeFinal")
    private String routeEndPoint;
    private int routeRating;
    
    
    public Routes(String routeClient, String routeDriver, String routeStartPoint, String routeEndPoint, int routeRating) {
        this.routeClient = routeClient;
        this.routeDriver = routeDriver; 
        this.routeStartPoint = routeStartPoint; 
        this.routeEndPoint = routeEndPoint; 
        this.routeRating = routeRating;
    }
    
    public void setRouteClient(String routeClient) {
        this.routeClient = routeClient; 
    }
    public void setRouteDriver(String routeDriver) {
        this.routeDriver = routeDriver;
    }
    public void setRouteStartPoint(String routeStartPoint) {
        this.routeStartPoint = routeStartPoint;
    }
    public void setRouteRating(int routeRating) {
        this.routeRating = routeRating;
    }
    
    public String getRouteClient() {
        return routeClient;
    }
    public String getRouteDriver() {
        return routeDriver;
    }
    public String getRouteStartPoint() {
        return routeStartPoint;
    }
    public String getRouteEndPoint(){
        return routeEndPoint; 
    } 
    public int getRouteRating() {
        return routeRating;
    }
    
    public static List<Routes> routesList = new ArrayList<>();

    public static void addRoute(Routes newRoute) {
        try {
            routesList.add(newRoute); 
            System.out.println("""
                               New Route Added
                               Clients Name: """ + newRoute.getRouteClient() + "\nClients Driver: " + newRoute.getRouteDriver() + "\nRoute: " + newRoute.getRouteStartPoint() + " => " + newRoute.getRouteEndPoint());
        } catch (Exception e) {
            System.out.println("Error catched at Routes.java line 29.");
            System.out.println(e);
        }
    }
    public static void rate_the_route() {
        System.out.println("TEST");
       
    }
    
}
