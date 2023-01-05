
 //creating a frame that contains background colour, a panel and a label.
 /**
 * panel - connects other components and is added to the frame, connot be displayed on its own.
 * frame - a separate window with a title bar.
 * label - component that shows information or text.
 */

import java.awt.*;   //abstract window toolkit
import javax.swing.*;   // package containing the GUI components

public class LearnToCreateGui
{
    public static void main( String[] myArray) throws Exception
    {
        //creating a frame object. Tjis frame is, by default, invisible
        JFrame frame = new JFrame("MY FRIST PROGRAMMED WINDOW");
        //setting an operation that will do nothing but to exit when you close the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating a panel object.
        JPanel panel = new JPanel();
        //making the background color to be blue, favorable on the panel.
        panel.setBackground(Color.yellow);
        //setting size of the pannel brackground
        panel.setPreferredSize(new Dimension( 500, 200));

        //creating a label with the string to be displayed
        JLabel label = new JLabel( "Today's date is 12 JUne 2021");

        //since label contains a string message, it should be passed to the panel that connects components
        panel.add(label);
 
        //since a pannel cannot be displayed by itself, we will pass it to the frame.
        frame.getContentPane().add(panel);
        //making the frame to be fit( with its dimensions specified)
        frame.pack();

        //making the frame to be visible
        frame.setVisible(true);
    }
}