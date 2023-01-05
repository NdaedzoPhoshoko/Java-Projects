/**
 * Author  : Phoshoko Clement
 * Date    : 2021-08-27
 * Program : Arranging array decimal numbers in ascending order
*/

import java.util.ArrayList;
import java.util.Scanner;

public class MyClass
{
    public static void main(String[] args) throws Exception
    {
         //Start here....storing decimal values to the arrayList
         Scanner decimalInput = new Scanner(System.in);  //declaring the object to accept decals from the user

         ArrayList<Double> unSortedArray = new ArrayList<Double>();
         System.out.print("Hy! How many decimals should i sort ? ");
         int numberLength = decimalInput.nextInt();  //collecting the number of decimals

         //collecting the decimals using a for-loop
         System.out.print("\nOkay! Enter " + numberLength+ " decimals to sort separed by space.\nEnter here : ");
         for( int a = 0; a < numberLength; a++)
         {
             unSortedArray.add( decimalInput.nextDouble());
         }
         //declaring an array fro sorted decimals
         double[] sortedArray = new double[numberLength];
         double tempVar;
         //contructing a for loop that will accumulate the lowest decimals one by one numberLengthe-times
         for ( int Count = 0; Count < numberLength; Count++)
         {
             //assigning the first value of the array in a tempVar
             tempVar = unSortedArray.get(0);
             for ( int index = 0; index < unSortedArray.size(); index++)
             {
                 //computing the lowest value in all those decimals
                if( unSortedArray.get(index) < tempVar)
                {
                    tempVar = unSortedArray.get(index);
                }
             }
                //after computing the lowest decimal store it to a sortedArray then remove it from the entered decimals
                 sortedArray[Count] = tempVar;
                 unSortedArray.remove(unSortedArray.indexOf(tempVar)); //removing tempVar value
                 unSortedArray.trimToSize(); //make the new numberLengthe of unSortedArray.length having removed the sorted elements
         }

         //display the sorted array
         System.out.print("\n[");
         for( double each: sortedArray)
         {
             System.out.print(" " + each);
         }
         System.out.println(" ]\n");

         decimalInput.close(); //closing the input Scanner object
    }
}
