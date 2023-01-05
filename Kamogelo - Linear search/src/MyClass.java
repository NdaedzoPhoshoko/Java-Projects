/**Create a GUI program that allows the user to search for if the integer is in the database/array or not.
 * The program shall display the position of the integer found ( e.g 1,2,30,4,5   key = 30, 30 is on position 3.
 * If not found, dsiplay "integer not found"
 * 
 * HINT USE LINEAR SEARCH
 */

 import javax.swing.JOptionPane;

public class MyClass
{
    public static void main( String[] args)
    {
        int control = 1;
        while( control == 1)
        {
        /**collect data from the user*/
        int control2 = 1;
        while(control2 == 1 )
        {
        String message = JOptionPane.showInputDialog("How many integers do you want to input?");
        int numOfInt = Integer.parseInt( message);

        if ( numOfInt == 0)
        {
            JOptionPane.showMessageDialog( null, "Please Enter positive real numbers", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        }
        int[] myArray = new int[ numOfInt];

        for( int num = 0; num < myArray.length; num++)
        {
            message = JOptionPane.showInputDialog("Enter integer : ");
            myArray[ num] = Integer.parseInt( message);
        }

        /**Ask the user for the integer to search */
        message = JOptionPane.showInputDialog("Enter the integer to search : ");
        int key = Integer.parseInt( message);
        
        /**print out if the key is found or not fount*/
        int position = method(myArray, key);

        if( position == -1)
        {
            JOptionPane.showMessageDialog(null, "Integer not found "+
            "\nThank you.", "LINEAR SEARCH", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            position++;
            JOptionPane.showMessageDialog(null, key + " is on position "+ position +
            "\nThank you.", "LINEAR SEARCH", JOptionPane.INFORMATION_MESSAGE);
        }


        int control1 = 1;
        while( control1 == 1)
        {
        String myControl = JOptionPane.showInputDialog(null, "Do you want to try again ? ");
        myControl = myControl.toUpperCase();

        if ( myControl.equals("YES"))
        {
            control = 1;
            control1 = 0;
        } else if ( myControl.equals("NO"))
        {
            control = 0;
            control1 = 0;
        } else 
            {
                JOptionPane.showMessageDialog(null, "Wrong option!!","Message", JOptionPane.INFORMATION_MESSAGE);
                control1 = 1;
            }
        }
    }
    }

    /**return method for finding the key*/
    public static int method( int[] array, int keyToSearch)
    {
        for( int num = 0; num < array.length; num++)
        {
            if( array[ num] == keyToSearch)
            {
                return num;
            }
        }

        return -1;
    }

}