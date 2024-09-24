import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class MyClass{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(6);
        
        list.addAll(list2);

        System.out.println(list2);
       
    }
}

class A {
    int r = 1;
    public String toString(){
        return r+"";
    }
    public boolean equals(Object o)
    {
        return this.r == ((A)o).r;
    }
}