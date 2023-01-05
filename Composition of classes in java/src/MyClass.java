public class MyClass {
    public static void main(String[] args) {
        Car mercedesCar = new Car("Mercedes AMG", 6, "Black", 1000000, new Engine("Renault", 9000));
        //String name, int numOfdoors, String color, int price, Engine engine
        System.out.println("Mercedes car : " + mercedesCar.getName()+ " "+
                          mercedesCar.getColor()+ " "+ mercedesCar.getNumOfdoors()+
                          " doors worth R"+ mercedesCar.getPrice()+".");
        System.out.println("Engine model : "+ mercedesCar.getEngine().getModel()+
                            " with "+ mercedesCar.getEngine().getRpm()+ "rpm.");   
    }
}
