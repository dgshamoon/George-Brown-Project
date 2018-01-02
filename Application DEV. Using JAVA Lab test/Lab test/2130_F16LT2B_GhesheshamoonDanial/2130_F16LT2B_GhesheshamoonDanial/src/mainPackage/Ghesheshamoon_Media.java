/*
 * course code: comp 2130
 * student Id: 101041512
 * last name: Gheseshamoon
 * first name: Danial
 */
package mainPackage;


public abstract class Ghesheshamoon_Media {
    protected String title;
    protected double price;
    protected int year;

    public Ghesheshamoon_Media() {
    }

    public Ghesheshamoon_Media(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void setYear(int year);

    @Override
    public String toString() {
        return "title: "+title+" \t\tprice: "+price+" \t\tyear: "+year;
    }
}
