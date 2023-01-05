  /*
  This program creates a frame that has nested panels
  Create two pannels nested into third panel
  */

import java.awt.*;
import javax.swing.*;

public class NestedPannels
{
    public static void main( String[] myArray) throws Exception
    {
        //Create a frame with the title
        JFrame frame = new JFrame("FRAME WITH TWO NESTED PANNELS ON THE THIRD PANEL");
        //tell it to exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set up first sub panel panel1, set some prefered size and give it a colour.
        Dimension sizeOfPanel = new Dimension( 150, 100);
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(sizeOfPanel);
        panel1.setBackground(Color.yellow);

        //creating a label that adds a string "Panel 1" to panel1
        JLabel label1 = new JLabel("Panel 1");
        panel1.add(label1);

        //set up second sub panel panel2, set some prefered size and give it a colour.
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize( sizeOfPanel);
        panel2.setBackground( Color.red);
        
        //creating a label that adds a string "Panel 2" to panel2
        JLabel label2 = new JLabel("Panel 2");
        panel2.add( label2);

        //creating panel3, with size that can occupy two panels and give it a diff color
        JPanel panel3 = new JPanel();
        //panel3.setPreferredSize( new Dimension( 500, 200));
        panel3.setBackground( Color.gray);

        //panel3 should have a name "Panel 3"
        JLabel label3 = new JLabel("Panel 3");
        panel3.add( label3);

        //Panel3 should contains the nested 2 panels, panel1 and panel2
        panel3.add(panel1);
        panel3.add( panel2);
        

        //Pass panel3 to the frame and make the frame to be visible
        frame.getContentPane().add(panel3);
        frame.pack(); //for the panels and labels to be fit
        frame.setVisible( true);

    }
}
