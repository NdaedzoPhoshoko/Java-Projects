
public class MyClass{
    public static void main(String [] args ){

    int seconds = 180;  //the seconds we are using 
    int minutes = 60;

    int RemainingSeconds = seconds % minutes;
    int RemainingMinutes = seconds / minutes;

    System.out.print("There is " + RemainingMinutes + " Minutes. ");
    System.out.print("And " + RemainingSeconds + " Seconds.");
  }
}


