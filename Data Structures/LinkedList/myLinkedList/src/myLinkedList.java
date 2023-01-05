
import java.util.*; //wildcat import

public class myLinkedList
{
    public static void main(String[] args) {
        
        
        List<Character> myList = new ArrayList<Character>();
        myList.add('H');
        myList.add('B');
        myList.add('E'); //index 2 is position 3
        myList.add('S');
        myList.add('T');  //index 4  position 5

        //<Interger> this means to wrapp integers

        LinkedList<Character> myNewList = new LinkedList<Character>(myList);
        /*This construtor constructs a new linkedList with values of another list
        */
        //System.out.println(myNewList.getLast()); //returns last element
        char middle = getMiddle(myNewList);
        System.out.println("Middle character is : "+ middle); //return middle value
        
    }

    static char getMiddle(LinkedList<Character> list) //middle finder
    {
        int indexMiddle = (list.size()-1)/ 2; //middle index
        return list.get(indexMiddle);  //will return a middle character of a list
    }


}