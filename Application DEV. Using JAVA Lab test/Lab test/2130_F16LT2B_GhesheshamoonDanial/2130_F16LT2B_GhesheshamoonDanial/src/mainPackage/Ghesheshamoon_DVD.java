/*
 * course code: comp 2130
 * student Id: 101041512
 * last name: Gheseshamoon
 * first name: Danial
 */
package mainPackage;

public class Ghesheshamoon_DVD extends Ghesheshamoon_Media{

    public Ghesheshamoon_DVD(String title, double price) {
        super(title, price);
        setYear(2016);
    }

    @Override
    public void setYear(int year) {
        this.year=year;
    }

    
}
