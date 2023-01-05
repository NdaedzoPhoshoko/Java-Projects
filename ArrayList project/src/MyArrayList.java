/**
 * Author : Ndaedzo Clement Phoshoko
 * Date   :03/08/2021
 * Project: A program that implements an ArrayList.
And stores the integer values in the array in ArrayList.
 *   
 */


import java.util.ArrayList; //for using ArrayList class
import java.util.Scanner;  //for using Scanner class

public class MyArrayList
{
    public static void main(String[] args) throws Exception
    {
        // Create an object of ArrayList class
        ArrayList<Integer> myArrayList = new ArrayList<Integer>(); //Dynamically create an ArrayList object
        // Add elements to the ArrayList myArrayList
        myArrayList.add(100);  //storing 100 in the ArrayList
        myArrayList.add(2);
        myArrayList.add(-12);

        // Display the elements of the ArrayList
        System.out.println("\nInterger values in the array : " + myArrayList);

        // Display the size of the ArrayList
        System.out.println("The size of the array is : " + myArrayList.size());
        /*
         * The size of the array is determined by the number of elements added to the array.
         */


         //For allowing the user to enter integer values to be inputed in the array
         System.out.println("\nEnter the 3 integer values to be stored in the array".toUpperCase());
         

         //Create a scanner object to allow the user to enter values
         Scanner input_Scanner = new Scanner(System.in);

         //loop for accepting integer values from the user
         int Count = 1, int_Value;
         while(Count <= 3)
         {
             System.out.print("Enter value : ");
             int_Value = input_Scanner.nextInt(); //accepting integer values from the user
             myArrayList.add(int_Value); //storing the integer values in the array
             Count++;
         }


         //Display the elements of the ArrayList
         System.out.println("Integer values in the array : " + myArrayList);
         System.out.println("The size of the array is : " + myArrayList.size());

         input_Scanner.close(); //closing the scanner object

    }
    
}
