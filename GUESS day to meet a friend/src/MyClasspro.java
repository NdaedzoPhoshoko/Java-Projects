/**MyClass.java: Suppose you want to meet your friend after some "days"
 * and you are not sure of the week day. Create a program that asks the user "how amny days to meet a friend? ",
 * "what is the the week day?"( eg Tuesday)
 * and then display the week day and number of weeks left to meet a friend and 
 */

 import java.util.*;

 public class MyClasspro {
     public static void main( String[] args) {
        
        Scanner objectInput = new Scanner( System.in);
        final int numberOfDaysInAWeek = 7;

        System.out.print( "How many days left to meet a friend ? ");
        int daysLeftToMeetFriend = objectInput.nextInt();
        //avoiding the bug of avoiding a string input after an int input
        objectInput.nextLine();

        System.out.print( "\nWhich day is today ? " +
        "\nHINT -> lower case 'monday', 'tuesday','wednesday'" +
        "'thursday',.... : ");
        String dayOfTheWeek;
        dayOfTheWeek = objectInput.nextLine();
        //use nextLine() method to accept tokens from the standardInput

        
        int day = 0;
        
        if ( dayOfTheWeek.equals("monday" ))
        {
            day = 1;
        }
        if ( dayOfTheWeek.equals("tuesday"))
        {
            day = 2;
        }
         if ( dayOfTheWeek.equals("wednesday"))
        {
            day = 3;
        }
         if ( dayOfTheWeek.equals("thursday"))
        {
            day = 4;
        }
         if ( dayOfTheWeek.equals("friday"))
        {
            day = 5;
        }
         if ( dayOfTheWeek.equals("saturday"))
        {
            day = 6;
        }
        if ( dayOfTheWeek.equals("sunday"))
        {
            day = 7;
        }
        if ( day == 0)
        {
            System.out.print( "Error, wrong option. Try again.");
        }

        /* if you might have noticed, the string is compared to another string using equal( " ") meythod
        we invoke this method with the variable to compare with*/

        if ( day != 0)
        {
        int dayToMeetFriend = ( day + daysLeftToMeetFriend ) % numberOfDaysInAWeek;
        int numberOfWeeks = ( day + daysLeftToMeetFriend) / numberOfDaysInAWeek;
        
        String answerDayToMeetFriend = " ";
        
        if ( dayToMeetFriend == 1)
        {
            answerDayToMeetFriend = "MONDAY";
        }
        if ( dayToMeetFriend == 2)
        {
            answerDayToMeetFriend = "TUESDAY";
        }
         if ( dayToMeetFriend == 3)
        {
            answerDayToMeetFriend = "WEDNESDAY";
        } 
        if ( dayToMeetFriend == 4)
        {
            answerDayToMeetFriend = "THURSDAY";
        }
         if ( dayToMeetFriend == 5)
        {
            answerDayToMeetFriend = "FRIDAY";
        }
        if ( dayToMeetFriend == 6)
        {
            answerDayToMeetFriend = "SATURDAY";
        }
        if ( dayToMeetFriend == 7)
        {
            answerDayToMeetFriend = "SUNDAY";
        }
        if( !(dayToMeetFriend >= 1 && dayToMeetFriend <=7) ){
            System.out.print( "Error, Sorry our system had a fault, Please try again.");
        }

        if ( daysLeftToMeetFriend != 0 && numberOfWeeks != 0)
        {
        System.out.print( "You will meet your friend on " + answerDayToMeetFriend +
        " in " + numberOfWeeks + " weeks time, Thank you.");
    }else if( daysLeftToMeetFriend != 0 && numberOfWeeks == 0)
    {
        System.out.print( "You will meet your friend on " + answerDayToMeetFriend +
        " This week");
    } else {
    System.out.print( "You will meet your friend today,this week Thank you.");
    }
}
        //closing the Scanner objectInput
        objectInput.close();
     }
 }