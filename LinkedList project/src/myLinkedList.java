/** 
 *Author : Ndaedzo Clement Phoshoko
 *Date   : 06/08/2021
 *About  : LinkedList
 *Project: Create a LinkedList that stores integers. It should be able to remove or add new integer elements.
 */

 import java.util.LinkedList; // Import LinkedList class


public class myLinkedList
{
    public static void main( String[] myArgs)
    {
        //Declare the LinkedList
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>(); //Dynamic Linked list

        myLinkedList.add(20); //Add an element to the LinkedList
        myLinkedList.add(5);
        myLinkedList.add(8);
        myLinkedList.add(-3);
        myLinkedList.addLast(Integer.parseInt("1")); //Add an element to the LinkedList);

        //Displaying elements of the LinkedList
        System.out.println("The LinkedList contains : " + myLinkedList);
        //Display the size of the LinkedList
        System.out.println("The size of the LinkedList is : " + myLinkedList.size());

        /**
         * Remove an element from the LinkedList
         * Display the value removed from the LinkedList
         * Display elements of the LinkedList and its size
         */

        int removed_Int = myLinkedList.remove(2);   //Removes the element at index 2, and assign the value removed to removed_Int

        System.out.println("The LinkedList contains : " + myLinkedList);
        System.out.println("The size of the LinkedList is : " + myLinkedList.size());
        System.out.println("The value removed from the LinkedList is : " + removed_Int);

        //Getting the index of the element removed
        System.out.println("The index of the value removed from the LinkedList is : " + myLinkedList.indexOf(removed_Int));
        
        //Adding new elements to the LinkedList
        myLinkedList.add(500);
        myLinkedList.add(600);

        //Displaying elements of the LinkedList
        System.out.println("The LinkedList contains : " + myLinkedList);

        //set new elements to the LinkedList
        myLinkedList.set(3, -100);
        myLinkedList.set(4, -200);

        //Displaying elements in the LinkedList
        System.out.println("The LinkedList contains : " + myLinkedList);
        //Displaying the size of the LinkedList
        System.out.println("The size of the LinkedList is : " + myLinkedList.size());

        //Display the value at certain index
        System.out.println("The value at index 3 is : " + myLinkedList.get(3));

        //emptying the LinkedList
        myLinkedList.clear();
        //checking if the LinkedList is empty
        if( myLinkedList.isEmpty() == true)
        {
            System.out.println("The list is " + "empty".toUpperCase());
        }

    }
}
