/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2130f16asn1_gheshshamoon_rolnick;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Danial Gheshe shamoon & Justin Rolnick
 * 
 *Student Id 101041512 & 100407074
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    //these two are variables
        
  static  ArrayList<Danial_Justin_Passenger> passengers = new ArrayList<>();    //to keep passengers
  static ArrayList<Danial_Justin_Flight> flights = new ArrayList <>();   //to keep the flights
  
  public static void main(String[] args) {
      
      //ArrayList<Danial_Justin_Passenger> passengers = new ArrayList<>();
      //ArrayList<Danial_Justin_Flight> flights = new ArrayList <>();
        
     char ch=showMenu();         //show menu and get selected from user
        while(ch!='q'){             //a loop this loop ends when user enter 'q'
           
            switch(ch){
                
                case '1':           //if user enter 1 that mean user wants to add a new flight
                    
                    addFlight();        //add a new flight
                    break;
                case '2':           //if user enter 2 that mean user wants to add a new passenger
                    
                    addPassenger();     //add new passenger and show thicket
                    break;
               
            }
             
            ch=showMenu();          //show menu and get user option in end of loop
        }
    }

    public static char showMenu() {  //show menu to user
       //ArrayList<Danial_Justin_Passenger> passengers = new ArrayList<>();
      //ArrayList<Danial_Justin_Flight> flights = new ArrayList <>();
        
        System.out.println("1.Add Flight");
        System.out.println("2.Add Passenger");
        System.out.println("q.Exit");
        Scanner sc=new Scanner(System.in);      //scanner to read from console
        char result=sc.next().charAt(0);        //for read a character;
        return result;
    }

    public static void addFlight() {               //to add new flight to flights list
       
       //ArrayList<Danial_Justin_Passenger> passengers = new ArrayList<>();
      //ArrayList<Danial_Justin_Flight> flights = new ArrayList <>();
        
        Scanner scanner=new Scanner(System.in);     //scanner to get data from user
        Danial_Justin_Flight flight=new Danial_Justin_Flight();     //create new object from flight
        System.out.println("Enter Flight number");          //show message to user
                                                                       //read flight number from user
        try {
         flight.setFlightNumber( scanner.nextInt()); 
    
         } catch(Exception  e) {
           System.err.println(" you have enterd a wronge flight number"); 
           
         }
        
        System.out.println("Enter Flight source");          //show message to user
        flight.setSource(scanner.next());                   //read flight source from user
        System.out.println("Enter Flight destination");
        flight.setDestination(scanner.next());
        System.out.println("Enter Flight fare");
        
        try{
        flight.setFlightFare(scanner.nextDouble());
        
        } catch(Exception  e) {
           System.err.println(" yo have enterd a wronge flight number"); 
         }
        
        System.out.println("Enter Flight Date");
        try{
            flight.setFlightDate(new Date(scanner.next()));             //convert string to date 
        }
        catch(Exception e){                         //if can not convert entered data to date 
            System.err.println("you have entered a wroge date");     //show error
        }
        
        flights.add(flight);            //add new flight to flights list
    }

    public static void addPassenger() {        //to add new passenger
        
        //ArrayList<Danial_Justin_Passenger> passengers = new ArrayList<>();
      //ArrayList<Danial_Justin_Flight> flights = new ArrayList <>();
        
        Scanner scanner=new Scanner(System.in);     //scanner to get data from user
        Danial_Justin_Passenger passenger=new Danial_Justin_Passenger();        //create new object from passenger
        System.out.println("Enter passenger first name:");      //show message to user
        passenger.setFirstName(scanner.next());             //read passenger first name from user
        System.out.println("Enter passenger last name");
        passenger.setLastName(scanner.next());
        System.out.println("Enter passenger age");
        passenger.setAge(scanner.nextInt());
        System.out.println("Enter passenger mile count");
        passenger.setMileCount(scanner.nextInt());
        System.out.println("Enter related flight number");          
        int fl=scanner.nextInt();                           //get related passenger flight number
        if(searchInFlights(fl)!=null)               //if entered flight number is valid
            passenger.setFlightNumber(fl);          //add flight number to passenger
        else{                                       //if entered flight number is invalid
            System.err.println("Entered flight number is wrong");           //show error
            return;                                                 //stop running method and get back
        }
        passengers.add(passenger);      //add new passenger to passengers list
        showTicket(passenger);          //show ticket of passenger
    }

    public static void showTicket(Danial_Justin_Passenger passenger) {         //show ticket information
       
        //ArrayList<Danial_Justin_Passenger> passengers = new ArrayList<>();
      //ArrayList<Danial_Justin_Flight> flights = new ArrayList <>();
        
        Danial_Justin_Flight flight=searchInFlights(passenger.getFlightNumber());           //find related flight to passenger
        System.out.println("Your Ticket Information is:");      //show message
        System.out.print("Flight Number: ");
        System.out.print(passenger.getFlightNumber());
        System.out.println("\t\tDate of travel: "+flight.getFlightDate());          //\t\t mean 2 tab space
        System.out.println("Source: "+flight.getSource()+"\t\tDestination: "+flight.getDestination());
        System.out.println("Passenger name:"+passenger.getFirstName()+" "+passenger.getLastName()+"\t\tPassenger age: "+passenger.getAge());
        System.out.println("Frequent flyer number: "+passenger.getFrequentFlyerNumber()+"\t\ttotal miles"+passenger.getMileCount());
        System.out.println("Total Fare Amount: "+getTotalFareAmount(passenger.getFlightNumber()));          //compute total fare of flight
    }

    public static Danial_Justin_Flight searchInFlights(int fl) {           //this method searchs flight number in flights list
      
        //ArrayList<Danial_Justin_Passenger> passengers = new ArrayList<>();
      //ArrayList<Danial_Justin_Flight> flights = new ArrayList <>();
        
        for (Danial_Justin_Flight flight : flights) {                   //loop that check flight list
            if(flight.getFlightNumber()==fl)                    //if flight with specific flight number found
                return flight;                  //return that flight
        }
        return null;                            //if not found return null value
    }

    public static double getTotalFareAmount(int flightNumber) {            //compute total fare of flight
       
        //ArrayList<Danial_Justin_Passenger> passengers = new ArrayList<>();
      //ArrayList<Danial_Justin_Flight> flights = new ArrayList <>();
        
        double sum=0;                                       //number of passengers of flight
        for(Danial_Justin_Passenger p:passengers){          //loop for passengers list
            if(p.getFlightNumber()==flightNumber){          //find passenger of this flight
                sum=sum+1;                                  //add it to passenger count
            }
        }
        Danial_Justin_Flight flight=searchInFlights(flightNumber);      //find specific flight 
        double totalFare=flight.getFlightFare()*sum;                    //multiply number of passengers by flight fare
        return totalFare;                                       //return flight fare
    }

    
    
}
