/*
Author : Ndaedzo Clement Phoshoko
Date   : 11 August 2021
Project: ArrayList and LinkedList
Program : This program passes an ArrayList of strings into the LinkedList
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class arrayList
{
    public static void main(String[] myArgs) throws Exception
    {
        //declare an ArrayList with capacity of 10 to store 10 names
        ArrayList<String> namesOfStu_ArrayList = new ArrayList<String>(10);

        namesOfStu_ArrayList.add("Sachin");  //index 0
        namesOfStu_ArrayList.add("Suresh");  //index 1
        namesOfStu_ArrayList.add("Sai");     //index 2
        namesOfStu_ArrayList.add("ndaedzo"); //index 3
        namesOfStu_ArrayList.add("Clement");  //index 4
        namesOfStu_ArrayList.add("Robert");   //index 5
        namesOfStu_ArrayList.add("James");   //index 6
        namesOfStu_ArrayList.add("John");   //index 7
        namesOfStu_ArrayList.add("Mark");   //index 8
        namesOfStu_ArrayList.add("Paul");   //index 9

        //declare a LinkedList with default capacity
        LinkedList<String> namesOfStu_LinkedList;

        //Display the original ArrayList
        System.out.println("\nOriginal ArrayList: " + namesOfStu_ArrayList + "\n");

        //storing four first names in the linked list
        namesOfStu_LinkedList = new LinkedList<String>(namesOfStu_ArrayList.subList(0, 4));
        System.out.println("The first four names are: " + namesOfStu_LinkedList + "\n");

        //removing a name from the the linked list according to the user's choice
        //user a scanner to accept the user's input
        //use the iterator to access the list
        Scanner scannerObject = new Scanner( System.in); //create a scanner object

        System.out.print("Which name to remove from the above list : ");
        String user_Choice = scannerObject.nextLine();  //get the user's choice
    
        //The following code is to remove a usere's name from the linked list
        String name_Removed = " ";
        int feedback = 0;
        for (int Count = 0; Count < namesOfStu_LinkedList.size(); Count++)
        {
            if( namesOfStu_LinkedList.get(Count).equals(user_Choice))
            {
                //..remove the name from the list
                feedback = 1;
                name_Removed = namesOfStu_LinkedList.remove(namesOfStu_LinkedList.indexOf(user_Choice));
                System.out.println("The name " + name_Removed + " has been removed from the list");
            }
        }

        if( feedback == 0)
        {
            System.out.println("The name " + user_Choice + " is not in the list");
            scannerObject.close();
            return;
        }
        //Display the new LinkedList having removed the name
        System.out.println("\nThe new LinkedList is: " + namesOfStu_LinkedList + "\n");

        scannerObject.close(); //close the scanner object
    }
}
        

/**
        //The following code is to remove a user's name from the array list
        int feedback = 0;
        ListIterator<String> listIterator = namesOfStu_ArrayList.listIterator();
        while(listIterator.hasNext())
        {
            if(listIterator.next().equals(user_Choice))
            {
                listIterator.remove();
                feedback = 1;
                System.out.println("The name " + user_Choice + " has been removed from the list");

            }
        }

 */
/**
 * There is a diffenrent between ArrayList and LinkedList
 * There is also a difference betweem remove() method on an iterator and remove(int) method on an ArrayList
 */