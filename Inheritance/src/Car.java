//parent class of child classes Bmw and Audi
public class Car {
    private String name; //private properties
    private String color;
    private int price;
    private boolean isAvailable;
    
    //constructor for Car
    public Car(String name, String color, int price, boolean isAvailable) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    //built-in method
    public void describe()
    {
        System.out.println("Name of Car: "+ name);
        System.out.println("Color of Car: "+ color);
        System.out.println("Price of Car: R"+ price+".00");
        System.out.println("Availability of Car: "+ isAvailable);
    }
}
