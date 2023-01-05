import java.util.Comparator;

public class weCompare implements Comparator<Object>
{
    @Override
    public int compare(Object e1, Object e2)
    {
        if((int)e1 < (int)e2)  //using type casting to covert from Objects to Integers
        {
            return -1; //notice that e1<e2
        }else if((int)e1 > (int)e2)
           {
                return 1; //notice that e1>e2
           }
        return 0; //else assuming e1==e2
    }
}

