/*
 * course code: comp 2130
 * student Id: 101041512
 * last name: Gheseshamoon
 * first name: Danial
 */
package mainPackage;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;


public class Ghesheshamoon_TestMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("course code: comp 2130");
        System.out.println("student Id: 101041512");
        System.out.println("last name: Gheseshamoon");
        System.out.println("first name: Danial");
        System.out.println("==========================================================");
        Ghesheshamoon_Media media1;
        Ghesheshamoon_Media media2;
        Ghesheshamoon_Media media3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first media title:");
        String firstTitle=scanner.next();
        System.out.println("Enter first media price");
        double firstPrice=scanner.nextDouble();
        media1=new Gesheshamoon_CD(firstTitle, firstPrice);
        System.out.println("==========================================================");
        System.out.println("Enter second media title:");
        String secondTitle=scanner.next();
        System.out.println("Enter second media price");
        double secondPrice=scanner.nextDouble();
        media2=new Ghesheshamoon_DVD(secondTitle, secondPrice);
        System.out.println("==========================================================");
        System.out.println("Enter third media title:");
        String thirdTitle=scanner.next();
        System.out.println("Enter third media price");
        double thirdPrice=scanner.nextDouble();
        media3=new Ghesheshamoon_DVD(thirdTitle, thirdPrice);
        System.out.println("==========================================================");
        
        System.out.println(media1.toString());
        System.out.println("==========================================================");
        System.out.println(media2.toString());
        System.out.println("==========================================================");
        System.out.println(media3.toString());
    }
    
}
