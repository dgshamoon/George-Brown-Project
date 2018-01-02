/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2130f16asn1_gheshshamoon_rolnick;
import java.util.Scanner;
/**
 *
 * @author Danial Gheshe shamoon & Justin Rolnick
 * Student Id 101041512 & 100407074
 */
public class Danial_Justin_Passenger {
   
    private String firstName;
    private String lastName;
    private int age;
    private String frequentFlyerNumber;
    private double mileCount;
    private int flightNumber;
    
    public Danial_Justin_Passenger() {
    }

    public void setFirstName(String firstName) {
        
        if (!firstName.matches("[a-zA-Z]+")) 
      
            System.err.println("Invalid name please retry");
            
        else
      
            this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        
        if (!lastName.matches("[a-zA-Z]+")) 
      
            System.err.println("Invalid lastname please retry");
            
        else
            
            this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age>120 || age<1)
            System.err.print("Entered Value for Age is invalid");
        else 
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Danial_Justin_Passenger(String firstName, String lastName, int age,String frequentFlyerNumber,double mileCount,int flightNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.frequentFlyerNumber=frequentFlyerNumber;
        this.mileCount=mileCount;
        this.flightNumber=flightNumber;
    }

    public String getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    public void setFrequentFlyerNumber(String frequentFlyerNumber) {
        this.frequentFlyerNumber = frequentFlyerNumber;
    }

    public double getMileCount() {
        return mileCount;
    }

    public void setMileCount(double mileCount) {
            this.mileCount = mileCount;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    
}
