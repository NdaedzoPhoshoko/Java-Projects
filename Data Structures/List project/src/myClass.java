
/*
Difference between Interface and Class
In a class: you instantiate the class - give an object of a class
In a Interface: Dont create an object, because there in no constructor
*/
import java.util.ArrayList;
import java.util.List;

public class myClass
{
    public static void main(String... arg) throws Exception
    {
        List<Double> list = new ArrayList<Double>(); //list
        list.add(0, 12.5);
        list.add(1,23.9);

        ArrayList<Double> arrayList = new ArrayList<Double>(12); //default initial capacity == 10
        arrayList.add(13.9999);
        //printf(arrayList);
        System.out.print("Size is "+ arrayList.size());
        
    }

    

    static void printf(List<Double> list)
    {
        System.out.print("List elements: ");
        System.out.print(list);
    }
    static void printf(ArrayList<Double> list)    //polymophism - two objects/ function share the same name but compute different tasks
    {
        System.out.print("ArrayList elements: ");
        System.out.print(list);
    }
}

/*
  The size() method does not return the initial capacity of the data structures
  It only returns the number of elements in that data structure
*/





/*Difference between position and index
char[] array = {'A', 'B','C'};
index           0     1   2
position        1    2    3

which position of an element to return (number)
array[number-1];
*/


/*
How to create an interface
interface myInterface
{
    void myF0();  //just declare, dont give them definitions
    void myF1();
}
*/
/*
        String learner = "Hey There";
        System.out.print(learner.substring(0, 3)); 
*/
