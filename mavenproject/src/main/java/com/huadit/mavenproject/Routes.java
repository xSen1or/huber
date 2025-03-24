/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huadit.mavenproject;

/**
 *
 * @author pumaloc0
 */
public class Routes {
    private String clientName; 
    private String driverName;
    private String routeStartPoint;
    private String routeEndPoint;
           
    
    public Routes(String clientName, String driverName, String routeStartPoint, String routeEndPoint) {
        this.clientName = clientName; 
        this.driverName = driverName; 
        this.routeEndPoint = routeEndPoint;
        this.routeStartPoint = routeStartPoint;
    }
    
    //getters and setters; 
    
    public void setClientName(String newClientName) {
        clientName = newClientName;
    }
    public void setDriverName(String newDriverName) {
        driverName = newDriverName; 
    }
    public void setRouteStartPoint(String newRouteStartPoint) {
        routeStartPoint = newRouteStartPoint;
    }
    
    
    
}
