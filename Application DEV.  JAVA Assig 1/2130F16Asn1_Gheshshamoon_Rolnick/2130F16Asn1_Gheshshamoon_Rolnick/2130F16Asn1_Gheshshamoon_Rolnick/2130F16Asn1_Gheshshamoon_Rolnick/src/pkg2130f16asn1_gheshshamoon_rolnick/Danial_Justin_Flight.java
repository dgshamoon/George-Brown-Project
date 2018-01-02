/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2130f16asn1_gheshshamoon_rolnick;

import java.util.Date;

/**
 *
 * @author Danial Gheshe shamoon & Justin Rolnick
 * Student Id 101041512 & 100407074
 */
public class Danial_Justin_Flight {
    
    
    private int flightNumber;
    private String source;
    private String destination;
    private double flightFare;
    private Date flightDate;
    
    
    public Danial_Justin_Flight(int flightNumber, String source, String destination, double flightFare, Date flightDate) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.flightFare = flightFare;
        this.flightDate = flightDate;
    }

    public void setFlightNumber(int flightNumber) {
          
        this.flightNumber = flightNumber;
    }

    public void setSource(String source) {
        
        if (!source.matches("[a-zA-Z]+")) 
      
            System.err.println("Invalid Source please retry");
          
        else
        
            this.source = source;
    }
    
    public void setDestination(String destination) {
        if (!destination.matches("[a-zA-Z]+")) 
      
            System.err.println("Invalid distination please retry");
            
        else
            
             this.destination = destination;
    }

    public void setFlightFare(double flightFare) {
        this.flightFare = flightFare;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public double getFlightFare() {
        return flightFare;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public Danial_Justin_Flight() {
    }
   
}
