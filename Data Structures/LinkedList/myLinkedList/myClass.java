
public class myClass {
    public static void main(String[] args) {
        myCompare myObject = new myCompare();
        int result = myObject.compare(12, 21);

        if(result == 1)
        {
            System.out.print("12 > 21");
        }else if(result == -1)
        {
            System.out.print("12 < 21");
        }else  //if 12 == 21
        {
            System.out.print("12 == 21");
        }

    }
}
