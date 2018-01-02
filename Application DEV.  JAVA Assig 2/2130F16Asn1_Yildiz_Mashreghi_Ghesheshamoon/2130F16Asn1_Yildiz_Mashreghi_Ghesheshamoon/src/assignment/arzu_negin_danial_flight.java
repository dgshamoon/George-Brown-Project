/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//100742996, Yildiz Arzu 
//100973300, Mashreghi Negin 
//Course code: Comp 2130

package assignment;

public class arzu_negin_danial_flight {

    public String destination ;
    public String dot;
    public String source ;
    public static double fare = 500.00;
    public static int flightNum = 8765456 ;
            
    public arzu_negin_danial_flight ()
    {
    
    }
    public arzu_negin_danial_flight (String source ,String destination)
    {
        this.source = source ;
        this.destination=destination;
    }
    public String getSource()
    {
        return source ;
    }
    public void setSource (String source)
    {
        this.source=source;
    }
    public String getDestination()
    {
        return destination ;
    }
    public void setDestination (String destination)
    {
        this.destination=destination;
    }
    ///////////////////////////////////////////////////
    public String getDot()
    {
        return dot ;
    }
    public void setDot (String dot)
    {
        this.dot=dot;
    }
    ///////////////////////////////////////////////////
    public double getFare()
    {
        return fare ;
    }
    public int getFlightNum ()
    {
        return flightNum;
    }
    public void setFlightNum (int flightNum)
    {
        this.flightNum=flightNum;
    }
    
    @Override
    public String toString() {
        return  "\nSource is : " + source +
                "\nDistination is : " + destination +
                "\nFlight Number is : " + flightNum +
//                "\nDate of Travel : " + dot + 
                "\nDate of Travel : " + dot.replace(' ', '/');
    }
}
