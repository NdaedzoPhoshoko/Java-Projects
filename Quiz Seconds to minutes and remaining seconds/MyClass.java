//inport the class that allows the user to enter values
// class Scanner
import java.util.Scanner;


public class MyClass{
      public static void main( String[] args)
    {
        // creating object INPUT for for acting as a standard input
        Scanner INPUT = new Scanner(System.in);
        
        int Minutes = 60;  //each minute has 60 seconds
        int Seconds;
        
        //accepting seconds from keyboard to var " Seconds"
        System.out.print("Enter the seconds : ");
        Seconds = INPUT.nextInt();// nextInt() method reads tokens from scanner " INPUT and conv then into actual values
        
        int Return_Minutes = Seconds / Minutes; // getting minutes in the int- form
        int Return_Seconds = Seconds % Minutes; // getting the seconds remaining as int- form
        
        System.out.print("Answer is " + Return_Minutes + " Minutes ");
        System.out.println("And " + Return_Seconds + " Seconds");
        
    }
  }