/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//100742996, Yildiz Arzu 
//100973300, Mashreghi Negin 
//Course code: Comp 2130


package assignment;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Arzu
 */
public class arzu_negin_danial_validation
{

    static boolean validation_for_letters(String value)
    {
        return value.matches("[a-zA-Z]+");
    }
    
    static boolean validation_for_alphanumerics(String value)
    {
        return value.matches("[a-zA-Z0-9]+");
    }
    
    static boolean validation_for_integers(String value)
    {
        return value.matches("[0-9]+");
    }
    
    static boolean tryParseInt(String value) {  
/*
      int age = 0;
      String temp;
      do{
          System.out.print("Enter passenger age (1-100): ");
          temp = scanner.next();
          if (tryParseInt(temp))
              age = Integer.parseInt(temp);
      } while(age<=0 || age>100);
*/
    try {  
         Integer.parseInt(value);  
         return true;  
      } catch (NumberFormatException e) {  
         return false;  
      }  
    }
    
    static String isFutureDate(int day, int month){
        DateFormat myFormat = new SimpleDateFormat("dd MM yyyy");   // from mid
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        //System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48

        String dot = day + " " + month + " " + 2016;
//        System.out.print(dot);
        
            try {
                Date date1 = myFormat.parse(dot);   // Date of travel
                Date date2 = myFormat.parse(myFormat.format(date)); // today's  date

                long diff = date1.getTime() - date2.getTime();  // difference in milliseconds

//                System.out.println("dot : " + date1);
//                System.out.println("today : " + date2);
//                System.out.println(date1.getTime());
//                System.out.println(date2.getTime());
//                System.out.println(diff);

                if(diff > 0){
                    return dot;  //System.out.println("future");
                }
            } catch (ParseException e) {
                return "";
//                e.printStackTrace();
            }
    return "";
    }
}
    
