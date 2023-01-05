/*
This program studies Queue

*/
import java.util.Queue; //implicit import to target the Queue class

public class QueueProject
{
    public static void main(String... args)
    {
        java.util.LinkedList<String> LL = new java.util.LinkedList<String>();
        LL.add("Mike");
        LL.add("Samantha");


        Queue <String> myQueue = LL;//declaring the QUEUE myQueue wrapping Strings from the LinkedList LL
        myQueue.offer("Ndaedzo Phopshoko"); //add(or offer) an element to the queue
        System.out.print("\n\n" + myQueue); //printing the entire queue

         String removed_name = myQueue.poll();//retries and remove the head of the queue, return it to removed_name
         if( !removed_name.isEmpty())
         {
            System.out.print("\n\n" + myQueue + "\n" + removed_name); //printing the queue having removed the head
        }
        
        System.out.print("\n\n" + myQueue); //printing the remianing queue
        System.out.print("\n\n" + myQueue.peek()); //retrieves but does not remove the head of myQueue

    }
}