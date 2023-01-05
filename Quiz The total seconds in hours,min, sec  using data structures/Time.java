
/*Quiz from C++ 
Quest: Do it in java but Using Class " time"
create a structure called *Time*. Its three members, all of type *int*
 should be called *hours*, *minutes*, and *seconds*.
 Write a java program that prompts the user to enter a time value in *hrs*, *min*, and *sec*.
 This can be in 12:59:59 format, or each data element can be entered at a separate prompt("Enter hours...").
 The program should then store the time in a variable of type *struct time*,
and finally *print out* the total number of *seconds* represented by this value.
*/

//implicit import for the object Scanner for standardInput
import java.util.Scanner;

public class Time{
    public static void main ( String[] args)
    {
        //creating a scanner called input
        Scanner INPUT = new Scanner( System.in);

        //creating an object myHours
        Time myHours = new Time();

        int truth = 1;

     while ( truth == 1)
      {
        //Asking information form the user
        System.out.print("Enter the Hours : ");
        myHours.hours = INPUT.nextInt();

        System.out.print("Enter the Minutes : ");
        myHours.minutes = INPUT.nextInt();

        System.out.print("Enter the Seconds : ");
        myHours.seconds = INPUT.nextInt();

        // time is in the format 12:59:59

        //determining the seconds in the time
        // 3600 is for  hours x 60 x 60 seconds
        myHours.total_Seconds = ( myHours.hours * 3600) + ( myHours.minutes * 60) + ( myHours.seconds);


        System.out.print("\nThere are " + myHours.total_Seconds + " Seconds, ");
        System.out.println("in time " + myHours.hours + ":" + myHours.minutes + ":" + myHours.seconds);

         
         int Choice = 1;
         while ( Choice == 1)
         {
         System.out.print("\nDo you want to try again? Y/N ");
         String MyAnswer;
         MyAnswer = INPUT.nextLine();

         //looping or terminating the project with the unswer's choice
         if ( MyAnswer == "Y" || MyAnswer == "y")
         {
             //looping the project with the unswer's choice
             Choice = 0;
             truth = 1;
         } else if ( MyAnswer == "N" || MyAnswer == "n")
         {
             //Terminating the project with the unswer's choice
             Choice = 0;
             truth = 0;
         } else 
              { System.out.print("\nWrong Option!!!. Enter Correct Option : \b");
              Choice = 1;
              }
            }

            //For closing the " INPUT" Scanner
         //We close the scanner in the main method
         INPUT.close();

      }
    }
      

    //declaring var integers hours, sec and min globally
    int hours, minutes, seconds;

    int total_Seconds;
 
}