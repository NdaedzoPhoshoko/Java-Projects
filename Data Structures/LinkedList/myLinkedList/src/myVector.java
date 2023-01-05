import java.util.*;

public class myVector {
    public static void main(String[] args) {
        Vector<Integer> myVector = new Vector<Integer>();
        myVector.addElement(12); //index 0  ( 1-1 = 0)
        myVector.addElement(2);  //index 1  (2-1 = 1)
        myVector.addElement(-2);  //index 2  (3-1 = 2)
        myVector.addElement(120); //position is number 4 but index is 4-1 = 3
        myVector.addElement(142);
        myVector.addElement(1);
        myVector.addElement(-10011);
        myVector.addElement(1002);
        myVector.addElement(0);

        System.out.print("Do you want to see the first element ");
        Scanner obj = new Scanner(System.in);
        String answer = obj.nextLine();

        if(answer.equals("yes"))
        {
            System.out.println("\n First element: " + myVector.firstElement());
        }else
        {
            System.out.println("Okay, thanks");
        }

        System.out.print("Do you want to see the last element ");
        answer = obj.nextLine();

        if(answer.equals("yes"))
        {
            System.out.println("\n Last element: " + myVector.lastElement());
        }else
        {
            System.out.println("Okay, thanks");
        }

        System.out.print("Do you want to remove an element ");
        answer = obj.nextLine();

        int index;
        if(answer.equals("yes"))
        {
            System.out.print("\n Which element position to remove: ");
            index = obj.nextInt(); // 0 1 2 3 4
            myVector.removeElementAt(index-1);
        }else
        {
            System.out.println("Okay, thanks");
        }

        System.out.print("Do you want to see the new list ");
        answer = obj.nextLine();
        answer = obj.nextLine();

        if(answer.equals("yes"))
        {
            System.out.println("New list is : "+ myVector);
        }else
        {
            System.out.println("Okay, thanks");
        }

        System.out.print("Do you want to remove an element, again ");
        answer = obj.nextLine();

        int valueToRemove;
        if(answer.equals("yes"))
        {
            System.out.print("\n Which integer to remove: ");
            valueToRemove = obj.nextInt();
            Boolean op_result = myVector.removeElement(valueToRemove);
            if(op_result == true)
            {
                System.out.println("Element(" + valueToRemove + ") has been removed");
            }else
            {
                System.out.println("Failed to remove Element(" + valueToRemove + ")");
            }
        }else
        {
            System.out.println("Okay, thanks");
        }

        System.out.print("Updated list is: " + myVector +"\n\nDo you want to change value in the list: ");
        answer = obj.nextLine(); //since this is ignored, dont worry about it, just compiler error, we will speak of it some other day
        answer = obj.nextLine();

        int value;
        if(answer.equals("yes"))
        {
            System.out.print("\nWhich element position to change: ");
            index = obj.nextInt();
            System.out.print("\nEnter new value to store: ");
            value = obj.nextInt();

            myVector.setElementAt(value, index-1); //set element at specified index 
            System.out.print("\n\nUpdated list is: " + myVector);
        }else
        {
            System.out.println("Okay, thanks");
        }


        obj.close();
    }

}
