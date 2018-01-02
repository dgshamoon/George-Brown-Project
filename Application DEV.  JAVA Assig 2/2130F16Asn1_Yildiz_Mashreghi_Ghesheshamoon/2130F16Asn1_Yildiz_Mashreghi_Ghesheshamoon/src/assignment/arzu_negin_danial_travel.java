/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//100742996, Yildiz Arzu 
//100973300, Mashreghi Negin 
//Course code: Comp 2130


package assignment;
import static assignment.arzu_negin_danial_validation.*;
import java.util.*;
import java.text.*;

/**
 *
 * @author negin_000
 */
public class arzu_negin_danial_travel {
    
    public Object passanger0 = new arzu_negin_danial_passanger();
    public Object flight0 = new arzu_negin_danial_flight();
    
    public static double totalFare(Object O)
    {
        double total = 0.00 ;
        if (O instanceof arzu_negin_danial_flight) 
        {
        total += ((arzu_negin_danial_flight)O).getFare() * 12.45 ;
        }
        
         return total ;
    
    }
    public static String DisplayInfo(Object O)
    {
        if (O instanceof arzu_negin_danial_flight) 
        {
            return (((arzu_negin_danial_flight)O).toString());
        }
        else if (O instanceof arzu_negin_danial_passanger) 
        {
            return (((arzu_negin_danial_passanger)O).toString());
        }
    return "";
    }
    public static void inputObject(Object o) {
        Scanner scanner = new Scanner(System.in);
        if (o instanceof arzu_negin_danial_passanger) {
//## Start ##############################################
        String temp = "";

        System.out.println();
        String fName;
        do{
            System.out.print("Enter passenger first name : "); 
            fName = scanner.nextLine();
        }
        while(!validation_for_letters(fName));
        ((arzu_negin_danial_passanger)o).setFirstName(fName);

/////////////////////////////////////////////////////////

        System.out.println();
        String lName;
        do{
            System.out.print("Enter passenger last name : ");
            lName = scanner.nextLine();
        }
        while(!validation_for_letters(lName));
        ((arzu_negin_danial_passanger)o).setLastName(lName);

/////////////////////////////////////////////////////////

        System.out.println();
        int age = 0;
        
        do{
            System.out.print("Enter passenger age (1-100): ");
            temp = scanner.next();
            if (tryParseInt(temp))
                age = Integer.parseInt(temp);
        } while(age<=0 || age>100);
      
//      System.out.print("your age is " + age);
        ((arzu_negin_danial_passanger)o).setAge(age);

/////////////////////////////////////////////////////////

        System.out.println();
        int fly_num = 0;
        
        do{
            System.out.print("Enter the Frequent Flyer Number [xxxxx] : ");
            temp = scanner.next();
            if (tryParseInt(temp))
                fly_num = Integer.parseInt(temp);
        } while(fly_num<=9999);

        ((arzu_negin_danial_passanger)o).setFrequetNum(fly_num);
        
/////////////////////////////////////////////////////////

        System.out.println();
        int miles = 0;
        do{
            System.out.print("Enter the Miles : ");
            temp = scanner.next();
            if(tryParseInt(temp))
                miles = Integer.parseInt(temp);
        }while(miles<=50);
            
        ((arzu_negin_danial_passanger)o).setMiles(miles);
        
/////////////////////////////////////////////////////////

    }
    else if (o instanceof arzu_negin_danial_flight) {
        
/////////////////////////////////////////////////////////
    String temp = "";

        System.out.println();
        String src = "";
        do{
            System.out.print("Enter Flight source : ");
            src = scanner.next();
        }while( ! validation_for_letters (src) );
        
        ((arzu_negin_danial_flight)o).setSource(src);                   

/////////////////////////////////////////////////////////

        System.out.println();
        String dest = "";
        do{
            System.out.print("Enter Flight destination : ");
            dest = scanner.next();
        }while( ! validation_for_letters (dest) );
        
        ((arzu_negin_danial_flight)o).setDestination(dest);

/////////////////////////////////////////////////////////

           int dot_day = 0;
           int dot_month = 0;

        do{
           System.out.println();
           do{
                System.out.print("Enter the Day that you are travelling [1-31]: ");
                temp = scanner.next();
                if (tryParseInt(temp))
                    dot_day = Integer.parseInt(temp);
           } while ( dot_day < 1 || dot_day > 31);

           System.out.println();
           do{
                System.out.print("Enter the Month that you are travelling [1-12]: ");
                temp = scanner.next();
                if (tryParseInt(temp))
                    dot_month = Integer.parseInt(temp);
           } while ( dot_month < 1 || dot_month > 12);
        } while ( isFutureDate( dot_day, dot_month ) == "" );

        ((arzu_negin_danial_flight)o).setDot(isFutureDate( dot_day, dot_month ) );
    }
    }
}
