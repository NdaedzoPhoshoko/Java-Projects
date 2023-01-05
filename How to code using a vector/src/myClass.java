import java.util.Vector;
//import java.util.ListIterator;
public class myClass
{
    public static void main(String[] args) throws Exception
    {
        //creatign an object of the vector array
        Vector<Integer> myVectorObject = new Vector<Integer>();

        //add 5 inters to the vector
        myVectorObject.addElement(12);
        myVectorObject.addElement(-10);
        myVectorObject.addElement(0);
        myVectorObject.addElement(5);
        myVectorObject.addElement(15);
        myVectorObject.trimToSize();  //size of the vector is reduced to 5

        /*
        //declare the list iterator
        ListIterator<Integer> myListIteratorObject = myVectorObject.listIterator();
        //calculate the max and min of the vector
        int stackForMax = myVectorObject.firstElement();
        int stackForMin = myVectorObject.firstElement();

        while(myListIteratorObject.hasNext())
        {
            if(myListIteratorObject.next() > stackForMax)
            {
                stackForMax = myListIteratorObject.next();
                
            }
            
            if(myListIteratorObject.next() < stackForMin)
            {
                stackForMin = myListIteratorObject.next();
            }

            myListIteratorObject.next(); //to skip the next element
        }
        //calculate the avarage
        int sum = 0;
        do
        {
            sum = sum + myListIteratorObject.next();
        }while( myListIteratorObject.hasNext());
        int sum = 0;
        while( myListIteratorObject.hasNext())
        {
            sum = sum + myListIteratorObject.next();
        }
        */

        //print the max and min
        int stackForMin = myVectorObject.firstElement();
        int stackForMax = myVectorObject.firstElement();
        int sum = 0;
        for( int a = 0; a < myVectorObject.size(); )
        {
            if(myVectorObject.elementAt(a) > stackForMax)
            {
                stackForMax = myVectorObject.elementAt(a);
            }
            if(myVectorObject.elementAt(a) < stackForMin)
            {
                stackForMin = myVectorObject.elementAt(a);
            }

            sum = sum + myVectorObject.elementAt(a);
            a++;
        }
        double avarage = (double)sum / (double) myVectorObject.size();

        //display the elements in the vector
        System.out.println("The elements in the vector are: " + myVectorObject);
        System.out.println("The maximum element in the vector is: " + stackForMax);
        System.out.println("The minimum element in the vector is: " + stackForMin);
        System.out.println("The avarage of the vector is: " + avarage);


    }
}