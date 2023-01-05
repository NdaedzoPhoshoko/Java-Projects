/*
 *Write a (GUI) application that asks a user how many integers to be entered,
 * then stores the integers in an array. Allow the user to enter all or a portion of the total integers.
 * Display the integers from first to last,
 * and then display the integers from last to first.
 * Display the minimum and maximum numbers as well as the total and average of the numbers. 
 */ 

//import the package with the class JOptionPane
import javax.swing.JOptionPane;

public class GuiApplication {
    public static void main( String[] args) {
        
        //create a dialog input asking the user for the number of inters to store
        String myMessage = JOptionPane.showInputDialog("How many integers to be entegers ?");
        // create a variable numberOfIntegers to accept the int value from user
        int numberOfIntegers = Integer.parseInt( myMessage);

        //string for displaying message in the dialog
        String myDialog;
        //int var actualNumber carries values of the user to the array myArray
        int actualNumber;
        
        //array of user's choice integers
        int[] myArray = new int[ numberOfIntegers];

        //declare var that caries the total
        int total = 0;

        //accepting values from user
        for ( int i = 0; i < myArray.length; i++)
        {
            myDialog = JOptionPane.showInputDialog("Enter Integer " + ( i+1));
            actualNumber = Integer.parseInt( myDialog);
            myArray[ i] = actualNumber;

            total += myArray[ i];

        }

        //tempMax carries the maximum integer used in the array
        int tempMax = myArray[ 0];
        //tempMin carries the minimum integer used in the array
        int tempMin = myArray[0];
        int i = 0;
        while ( i < myArray.length)
        {
            //for computing the min into var tempMin
            if ( myArray[ i] < tempMin )
            {
                tempMin = myArray[ i];
            }

            //for finding the max value into var tempMax
            //for a mix of intergers ( + or -)
            if ( myArray[ i] > tempMax )
            {
                tempMax = myArray[ i];
            }
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "DISPLAYING INTEGERS FROM FIRST TO LAST.");
        //dsiplaying integers from fist to last
        i = 0;
        for ( i = 0; i  < myArray.length; i++)
        {
            JOptionPane.showMessageDialog(null, myArray[ i], "INTEGERS FROM FIRST TO LAST", JOptionPane.INFORMATION_MESSAGE);
        }
        //displaying integers from last to first
        JOptionPane.showMessageDialog(null, "DISPLAYING INTEGERS FROM LAST TO FIRST.");
        i = 0;
        for ( i = 1; i  < myArray.length+1; i++)
        {
            JOptionPane.showMessageDialog(null, myArray[ numberOfIntegers-i], "INTEGERS FROM LAST TO FIRST", JOptionPane.INFORMATION_MESSAGE);
        }

        //for displaying maximum
        JOptionPane.showMessageDialog(null, "DISPLAYING MAXIMUM.");
        JOptionPane.showMessageDialog( null," maximum = " + tempMax, "DISPLAYING MAXIMUM", JOptionPane.INFORMATION_MESSAGE);
        //for dsiplaying the minimum
        JOptionPane.showMessageDialog(null, "DISPLAYING MINIMUM.");
        JOptionPane.showMessageDialog( null," minimum = " + tempMin, "DISPLAYING MINIMUM", JOptionPane.INFORMATION_MESSAGE);
        //for displaying total
        JOptionPane.showMessageDialog(null, "DISPLAYING TOTAL.");
        JOptionPane.showMessageDialog( null," total = " + total, "DISPLAYING TOTAL", JOptionPane.INFORMATION_MESSAGE);

        //for computing the avarage into var avarage
        GuiApplication object = new GuiApplication();

        double average;
        average = object.method( total, numberOfIntegers);

        JOptionPane.showMessageDialog(null, "DISPLAYING AVERAGE.");
        //for displaying avarage
        JOptionPane.showMessageDialog( null," average = " + average, "DISPLAYING AVERAGE", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog( null, "THANK YOU.");
        
    }


    
    //method that returns a double average
    public double method( double totalNum, double numOfInt)
    {
        double averageNumber = totalNum/ numOfInt;
        return averageNumber;
    }
}




