/**program to display values in an array using java for-each loop*/

/**import package for Standardinput*/
import java.util.Scanner;

public class MyClass{
    public static void main( String[] args)
    {
        /**impelementing an object scanner for input*/
        Scanner obj = new Scanner( System.in);

        /**asking the user the number of integers to implement*/
        System.out.print( "How many Integers to input ? ");
        /**integer var INDEX to take in input*/
        int INDEX = obj.nextInt();

        /**declaring an integer array MyArray
         * with number INDEX values*/
        int[] MyArray = new int[ INDEX];


        /**display
        ceating an object for calling method MyFunc1*/
        MyClass obj1 = new MyClass();
        System.out.println( obj1.MyFunc1() );

        
        /**implementing values n an aray using a do while loop*/
        int INDEX1 = 0;
        do{
            System.out.print( "Enter value: ");
            MyArray[ INDEX1] = obj.nextInt();
            ++INDEX1;
        } while ( INDEX1 < INDEX);

        /**display
        ceating an object for calling method MyFunc
        using the same instance obj1*/
        System.out.println( obj1.MyFunc() );


        /**printing out the values using a for each loop
        for each loop is used for printing out values easily, not for implementing( assigning) an array*/
        
           for( int INDEX2 : MyArray) 
           {
               /**For Each, meaning for INDEX2 takes value in list MyArray */
               System.out.println( INDEX2);
           }
        /**closing the obj Scanner input*/
        obj.close();
    }
    /**Method to display*/
    public String MyFunc()
    {
        return ( "\nValues are : ");
    }
    public String MyFunc1()
    {
        return ( "\nStoring values...");
    }

}