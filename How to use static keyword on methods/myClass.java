public class myClass  //creating a class called myClass made public
{
    public static void main(String[] args) //main function/ main method
    {
        //code is driven 
        myFunction("Nthaby & Ntsaki");
        hy2 = 10;
        
        //declare an object of type myClass so that we may access the fucntion myAdd()becacuse is not made static
        myClass myObject = new myClass(); //nameClass nameObject = new nameClass();
        int sum = myObject.myAdd(20, 4); //returns and assigns 20+4 into sum

        //then we can use sum
        System.out.print("Sum is " + sum); //display sum

    }
    //outside
    static int hy2; //static variable declared globally
    //Because this hy2 is static, there is no need to create objects for accessing it

    //If a method is made static, you do not have to use an object to access it
    static void myFunction(String var)
    {
        //body/definition
        System.out.println("Name is " + var);
        
    }
    //create a function that is non-static that passed two integers and adds them
    int myAdd(int value1, int value2)  //another word for arguments is parameters
    { 
        return value1+value2;
    } //becuase this method is not made static, please use an object in main to access it



    
}