/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//100742996, Yildiz Arzu 
//100973300, Mashreghi Negin 
//Course code: Comp 2130


package assignment;


public class arzu_negin_danial_passanger {
    
    public String firstName ;
    public String lastName ;
    public int frequetNum;
    public int miles ;
    public int age ;
    
    public arzu_negin_danial_passanger()
    {
   
    }
    public arzu_negin_danial_passanger(String firstName , String lastName ,int age ,int frequetNum, int miles)
    {
       this.firstName= firstName;
       this.lastName=lastName;
       this.age=age;
       this.frequetNum=frequetNum;
       this.miles = miles ;
    }
    public String getFirstName ()
    {
       return firstName;
    }
    public void setFirstName (String firstName)
    {
        this.firstName= firstName;
    }   
    public String getLastName ()
    {
       return lastName;
    }
    public void setLastName (String lastName)
    {
        this.lastName=lastName;
    }
    public int getAge ()
    {
       return age;
    }
    public void setAge (int age)
    {
        this.age=age;
    }
    public int getFrequetNum ()
    {
       return frequetNum;
    }
    public void setFrequetNum (int frequetNum)
    {
        this.frequetNum=frequetNum;
    }
    public int getMiles ()
    {
       return miles;
    }
    public void setMiles (int miles)
    {
        this.miles=miles;
    }

   @Override
   public String toString() {
    return  "\nFirst name is : " + firstName +
            "\nLast name is : " + lastName +
            "\nAge is : " + age +
            "\nFrequent Flyer Number : " + frequetNum +
            "\nMiles : " + miles ;
  }
}
