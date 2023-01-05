/** Write a (GUI) application in which you declare an array of 10 first names.
 *  Write a try block in which you prompt the user for an
    integer and display the name in the requested position (index).
    Create a catch block that catches the potential ArrayIndexOutOfBoundsException thrown when the user enters a number that is out of range. 
    The catch block also should display an error message. 
 */

 import javax.swing.JOptionPane;

public class MyClass
{
    public static void main( String[] var)
    {
        String[] myArray = new String[]{"Jane","Amber","Clement","Banana","Kamogelo",
                                         "Vanessa","John","Blessing","Paul","Lerato"};  
        String dialog;
        try
        {
            dialog = JOptionPane.showInputDialog(null, "Enter an integer");
            int position = Integer.parseInt(dialog);
            JOptionPane.showMessageDialog(null,"Index[" + position +"] = " + myArray[ position], "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        /*catch(ArrayIndexOutOfBoundsException exception)
        {
            JOptionPane.showMessageDialog( null, exception.getMessage(), "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }*/
        catch(NumberFormatException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
}