//child class : Audi
//parent class : Car
public class Audi extends Car
{
    //property and its "setters and getters"
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //changing method describe() found in Car class
    @Override
    public void describe() {
        // TODO Read me, we override method describe() to change its defintion
        super.describe(); //this includes all previous definitions of describe();
        System.out.println("Country is " +this.country);
    }

    public Audi(String name, String color, int price, String country, boolean isAvailable) {
        super(name, color, price, isAvailable);
        this.country = country;
    }

    public void move() //uses method getName()
    {
        System.out.println("Car "+ this.getName() + " is moving.");
    }
}