import java.util.Scanner;

public class MyClass
{
    public static void main(String... args)
    {
        Scanner myObj = new Scanner(System.in);

        boolean userOption = true;
        while(userOption)  //assume is true to allow the program to run
        {
            //place the whole code here

            //the drive code
            System.out.print("Hey, i've started\n Do you still want to run me ? > ");
            String option = myObj.next();  //collect user option
            if(option.equals("yes"))
            {
                userOption = true; // continue 
            }else if(option.equals("no"))
                  {
                      userOption = false; //terminate
                      System.out.print("Bye.....");
                  }else
                      {
                          System.out.println("Wrong option");
                      }
        }
        myObj.close(); //close the Scanner object
    }
}