/*
This program studies PriorityQueue
In a priority queue, elements are assigned priorities. 
When accessing elements, the element with the highest priority is removed first
Simply meaning its capable of sorting numbers from small to high
*/
import java.util.PriorityQueue; //wildcat import including the priorityQueue
import java.util.ArrayList;
import java.util.Scanner;

public class PriorityQueueProject
{
    public static void main(String... args)
    {
        PriorityQueue<Integer> p_queue = new PriorityQueue<Integer>(); //constructor create a default capacity of 11
        p_queue.offer(12);//insert element at the end of the p_queue

        //Lets offer the whole ArrayList array_L with six integers to the p_Queue
        ArrayList<Integer> array_L = new ArrayList<>(5);
        array_L.add(10);
        array_L.add(2);
        array_L.add(-1);
        array_L.add(0);
        array_L.add(12);
        array_L.add(100);

        p_queue.addAll(array_L); //insert all elements from array_L to the p_queue
        //displaying the complete Priority Queue
        System.out.print("\n" + p_queue); //0 2 10 12 12 100

        System.out.print("\n Do you wan to clear the Priority Queue? : ");
        Scanner myObj = new Scanner(System.in);
        String answer = "Oops";

   boolean truth = true;
  while(truth == true)
  {
      answer = myObj.next();
      answer = answer.toUpperCase();
        if( answer.equals("YES") || answer.equals("Y"))
        {   //clear all the elements in the queue, priority queue gets empty
            p_queue.clear();
            System.out.print("\nQueue Cleared, Thank you.");
            truth = false; //stop getting the answer
        }else if( answer.equals("NO")|| answer.equals("N"))
        {
            System.out.print("\nThank you");
            truth = false; //stop getting the answer
        }else
        {
            System.out.print("\nEnter the correct option ");
            // truth = true; //contine getting the answer
        }

 }
       myObj.close(); 
    }
}

/**
  try
     {
        answer = myObj.nextLine();
     }catch( Exception msg)
    {
        System.out.print("Error!!! " + msg);
    }
 */
