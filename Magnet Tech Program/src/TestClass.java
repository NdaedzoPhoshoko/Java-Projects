
import java.awt.*;
import javax.swing.*;

public class TestClass {
    public static void main(String[] args) throws Exception
    {
        //...
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize( new Dimension(800, 500));
        frame.setTitle("Test Frame");
        frame.setLocation(250, 150);

        JPanel panel = new JPanel();
        panel.setBackground( new Color(255,0,0)); // R G B

        frame.add(panel);
        frame.setVisible(true);
        frame.pack();
        
    }
}

