
public class Car 
{
    private String name;
    private int numOfdoors;
    private String color;
    private int price;
    private Engine engine; //object for class Engine, made private
    public Car(String name, int numOfdoors, String color, int price, Engine engine) {
        this.name = name;
        this.numOfdoors = numOfdoors;
        this.color = color;
        this.price = price;
        this.engine = engine;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfdoors() {
        return numOfdoors;
    }
    public void setNumOfdoors(int numOfdoors) {
        this.numOfdoors = numOfdoors;
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

    /**
     * Returns an engine of car
     * @return engine
     */
    public Engine getEngine() {
        return engine;
    }
    /**
     * This method sets the engine of car. The engine belongs to class Engine
     * @param engine
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }   
}
