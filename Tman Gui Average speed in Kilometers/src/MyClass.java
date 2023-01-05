/**(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)*/

/*public class MyClass
{
    public static void main(String[] args)
    {
        // 1 mile is equal to 1.6 kilometers.

        double kilometers = 24 * 1.6; // Converting miles into kilometers.
        double seconds = 60 * 60 + 40 * 60 + 35; // Converting 1 hour, 40 minutes, and 35 seconds into seconds.
        double rate = seconds / (60 * 60); // Converting seconds into hours.

        double average = kilometers / rate;
        System.out.println(average);
    }
}*/

/*(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.) but displays the results on a dialog*/

/*import javax.swing.JOptionPane;

public class MyClass
{
    public static void main(String[] args)
    {
        // 1 mile is equal to 1.6 kilometers.

        double kilometers = 24 * 1.6; // Converting miles into kilometers.
        double seconds = 60 * 60 + 40 * 60 + 35; // Converting 1 hour, 40 minutes, and 35 seconds into seconds.
        double rate = seconds / (60 * 60); // Converting seconds into hours.

        double average = kilometers / rate;
        
        JOptionPane.showMessageDialog(null, average);
    }
}*/

//GUI program of computing the hypotenuse of a triangle , also allow the user to promt the integers

import javax.swing.JOptionPane;

import java.lang.Math;

public class MyClass
{
    public static void main(String[] args)
    {
       String message = JOptionPane.showInputDialog("Enter Adjecent ");
        double adjecent = Double.parseDouble( message);

       message = JOptionPane.showInputDialog(null, "Enter Opposite ");
        double opposite = Double.parseDouble(message);

        double hypotenuse = adjecent * adjecent + opposite * opposite;
        
        double results = Math.sqrt( hypotenuse);
        JOptionPane.showMessageDialog( null, " hypotenuse = " + results);

    }
}