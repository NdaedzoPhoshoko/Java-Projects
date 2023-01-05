
//A program that includes an image icon on a panel
import java.awt.*;
import javax.swing.*;

public class AFrameWithImages {
    public static void main( String[] myArray)
    {
        JFrame frame = new JFrame( "Message Including Image");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

        //create the ImageIcon object icon
        ImageIcon icon = new ImageIcon("Images/child.gif");

        //declare panel that will have a blue color
        JPanel panel = new JPanel();
        //panel.setPreferredSize( new Dimension( 250, 100));
        panel.setBackground( Color.blue);

        //creating a label that has an image and set the prefered position, explicitly
        JLabel label = new JLabel("CHILD GIF ICON", icon, SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.CENTER);

        //connect the frame, panel and the label
        panel.add( label);
        frame.getContentPane().add( panel);
        frame.pack();
        frame.setVisible( true);
        
    }
}
