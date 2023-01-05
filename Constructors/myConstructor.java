import java.util.*; //wildcat import of all classes in java.util packadge

public class myConstructor
{
    //create a constructor
    /*myConstructor(String message)
    {
        System.out.print(message);
    }
    */
    /*
    myConstructor()
    {
        System.out.print("\n\nCompSci campany\n\n");
    }
    */
    public static void main(String[] args)
    {
        myConstructor object = new myConstructor(); //declared the object
        //simply meaning: in java, constructors are automatically created when you create a
        Scanner ob_sc = new Scanner(System.in); //Scanner(System.in) is also a constructor of class Scanner
        ArrayList<String> AL = new ArrayList<String>(); //ArrayList<String>() is a constructor
    }
}
/*
Notes:

syntax of declaring the object:
     nameOfClass objectName = new nameOfClass()
               but nameOfClass() is always our constructor
*/