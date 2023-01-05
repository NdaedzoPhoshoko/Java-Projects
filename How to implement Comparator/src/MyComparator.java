import java.util.Comparator;

public class MyComparator implements Comparator<Object>
{ //myComparator is an Abstract Class while Comparator is a Base Class

    public int compare(Object o1, Object o2)
    {
        // Needed for javac to compile
        if( o1 instanceof Integer || o2 instanceof Integer) //check if the object is of type integer
        {
            int name1 = (int) o1;
            int name2 = (int) o2;
            if ( name1 > name2)
              {
                return 1;  //this implies that o1 is greater than o2
              }else if ( name2 > name1 )
                     {
                         return 0; //this implies that o1 is less than o2
                     }
        }else if ( o1 instanceof String || o2 instanceof String)
        {
            String name1 = (String) o1;
            String name2 = (String) o2;
            if ( name1.length() > name2.length())
              {
                return 1;  //this implies that o1 is greater than o2
              }else if ( name2.length() > name1.length())
                     {
                         return 0; //this implies that o1 is less than o2
                     }
        }
        return 2; //if name1 == name2
    }
}