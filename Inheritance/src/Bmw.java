//child class : Bmw
//parent class : Car
public class Bmw extends Car
{
    private String country;//property that only belongs to Bmw class

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Bmw(String name, String color, int price, String country, boolean isAvailable) {
        super(name, color, price, isAvailable);
        //TODO read this, super sets properties of this constructor to those of Car
        this.country = country;
    }
    
}