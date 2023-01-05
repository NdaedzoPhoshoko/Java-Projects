import java.util.Arrays;
import java.util.Collections;

public class MyClass {
    public static void main(String[] args) throws Exception {
        Integer a1[] = {1,2,3,4};
        Integer a2[] = {3,4};
        int answer = findArray(a1,a2);
        if(answer==-1)
        {
            System.out.print("No");
        }else
        {
            System.out.print("Second is Subsequence of first array");
        }

    }
    public static int findArray(Integer[] array, Integer[] subArray)
    {
        return Collections.indexOfSubList(Arrays.asList(array), Arrays.asList(subArray));
    }
}
