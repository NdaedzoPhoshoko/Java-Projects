package MyProject;

import javax.swing.JOptionPane;

public class MyProject
{
    public static void main( String[] var)
    {
        String[] myArray = new String[]{"Pet","Dog","Elephant","Lion","Tiger",
                                         "Jaguar","Cheetah","Hyena","Cat","Bee"};  
        try
        {
            String MyString = JOptionPane.showInputDialog(null, "Enter an integer");
            int MyInteger = Integer.parseInt(MyString);
            JOptionPane.showMessageDialog(null, "NAME["+MyInteger+"] has " + myArray[ MyInteger], "NOTIFICATION", JOptionPane.INFORMATION_MESSAGE);
        }

        catch(NumberFormatException objectException)
        {
            JOptionPane.showMessageDialog(null, objectException.getMessage(), "NOTIFICATION", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
}