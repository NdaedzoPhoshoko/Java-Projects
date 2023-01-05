/**
 * This code prints the name that has a lot of length between two names, if not it reports that they are equal
 */
import java.util.Scanner;

public class MyClass
{
    public static void main(String... myArgs)
    {
        Scanner myScannerobj = new Scanner( System.in);
        Object firstName = "0", lastName = "0";
    try{
        System.out.println("\nEnter the first: ");
        firstName = myScannerobj.nextLine();
        System.out.println("Enter the second: ");
        lastName = myScannerobj.nextLine();
    }catch(Exception msg)
    {
        System.out.print("Error, " + msg);
    }

        MyComparator myCompareObject = new MyComparator();// declare the object of MyComparator class

        int result = myCompareObject.compare( firstName, lastName); // returns 1, 0 or 2

        if ( result ==1)
        {
            System.out.print("\n"+ firstName + " Is having a greater length than " + lastName );
        }else if ( result == 0)
        {
            System.out.print( firstName + " Is having a less length than " + lastName);
        } else  //when result == 2
        {
            System.out.print( "Lengths of names are equal");
        }
        myScannerobj.close();
    }

}





/**
 * Impelement - on a method to innovate
 * @Override - We override a method, meaning we aim to change the method inside some class
 * Extend - a subclass extends a base class
 *         - interface extends an interface
 */

