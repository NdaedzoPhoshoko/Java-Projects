import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class myListClass
{
    public static void main(String[] args)
    {
        //declare a list of integers
        List<Integer> myList = new ArrayList<Integer>(); //recall that List class does not have a constructor
        
        //add five elements( 100, -100, 20, 023, 4, 100) of type integers
        myList.add(0, 100);  //same as myList.add(100);
        myList.add(1, -100);
        myList.add(2, 20);
        myList.add(3, 23);  //index 3 element is 23
        myList.add(4, 4);
        myList.add(5, 100);
        
        //display the list
        System.out.print("List elements are: ");
        printList(myList);  //displays all integers of myList

        //Display element at index 3  ( Postion 4)
        System.out.print("Element at index 3 is: ");
        System.out.println(myList.get(3));

        //Display the index of element 100
        System.out.print("Index of element 100 is: ");
        System.out.println(myList.indexOf(100));

        //Display the sub list with three elements from index 2 to index 4   // index 2,3,4
        System.out.println("Sublist(2, 5) : " + myList.subList(2, 5)); //number of element = 5-2 = 3
        //printList(myList.subList(2, 5)); //still the same

        //Change element 20 to 40, this is also called setters
        //
        myList.set(myList.indexOf(20), 40); // same thing as myList.set(2, 40);
        System.out.println("New list updated: " + myList);

        //Lets now learn how to use list iterators - they traverse through the list elements

        //Declare a ListIterator that will traverse the element of the list
        ListIterator<Integer> myListIterator = myList.listIterator(); //listIterator traverses the list myList
        
        System.out.print("ListIterator traversing :");
        while(myListIterator.hasNext())
        {
            System.out.print(myListIterator.next() + " ,");
        }  //this traverse through the list myList displaying all of them


        //Increment (increase by adding) by 1 the integers of myList
        //Go try working with ArrayList<Character> mArrayList = new ArrayList<Character>();
        
    }

    //create a fucntion printList that display elements of a list
    static void printList(List<Integer> list) //aguments can be objects/ data structures
    {
        System.out.println(list);
    }



}

// <Double> means to wrap the double values