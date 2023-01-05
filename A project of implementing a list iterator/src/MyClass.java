import java.util.ArrayList; //import implicitly
import java.util.LinkedList;
import java.util.ListIterator;


public class MyClass
{
    public static void main( String ... myArgs) throws Exception
    {
        ArrayList<String> myArrayList = new ArrayList<String>(); //create an ArrayList having default capacity
        myArrayList.add("Hello");    //0
        myArrayList.add("World");     //1
        myArrayList.add("!");           //
        myArrayList.add("How Are you?");    //3
        myArrayList.add("I am fine");         //4
        myArrayList.add("I have a message which is : ");     //5
        myArrayList.add("How crazy is coding"); //6

        myArrayList.trimToSize(); //size of the ArrayList is 7 by number of elements stored in the ArrayList

        
        LinkedList<String> myLinkedList = new LinkedList<>(myArrayList.subList(3, 7)); //create a LinkedList having elements from index 3 to 6));
        myLinkedList.add("Message Closed!!!");

        //display the elements of the LinkedList
        System.out.println("LinkedList : " + myLinkedList);

        //remove an element from the LinkedList using list iterator
        ListIterator<String> myListItr = myLinkedList.listIterator();//create a ListIterator
        String nextValue = " ";

        System.out.print("\nEnter message to remove from the list : ");
        java.util.Scanner myObjInput = new java.util.Scanner( System.in);
        String user_Choice = myObjInput.nextLine();
        while(myListItr.hasNext())
        {
            nextValue = myListItr.next();
            if( nextValue.equals(user_Choice))
            {
                myListItr.remove(); //remove the element returned by the list iterator next()
                System.out.print("Message removed!!!!".toUpperCase());

            }
        }

        //display the elements of the LinkedList
        System.out.println("\nLinkedList : " + myLinkedList);
        myObjInput.close(); //close the Scanner
    }
}

//there is a remove() in a listIterator and also a remove(index)  in a list

/* 
     int i = 0;
       while(i < myLinkedList.size()) )
       {
           if(userInput.equals(myLinkedList.get(i)))
           {
               myLinkedList.remove(i);
               i = 5000; 
           }
           i++;
       }
*/

/**
 * For utilizing a block of code in a loop, use a for loop, while loop, or do-while loop.
 * but if you want to display a list of elements, use a for-Each loop.
 * 
 * structure of for-Each loop
 * for ( <variable> : elements)
 *    {
 *     <code>
 *    }
 * 
 * eg.
 * for ( int Each: myLinkedList)
{
    System.out.println(Each);
}
 */

/**
 * //How to remove an element from the linkedList using a for loop
 * java.util.Scanner objInput = new java.util.Scanner(System.in);

        System.out.print("Enter a message to remove : ");
        String userInput = objInput.nextLine();

        for(int i = 0; i < myLinkedList.size(); i++)
        {   // 0 1 2 3 4
            
            if(userInput.equals(myLinkedList.get(i)))
            {
                myLinkedList.remove(i);
                System.out.println("The new linkedList is " + myLinkedList);
                objInput.close();//
                return;
            }
        }
        objInput.close();//
 */