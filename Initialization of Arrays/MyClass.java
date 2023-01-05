public class MyClass{
    public static void main( String[] args)
    {
        //declaring an array "MyArray" and assigning it with 10 doubles
        double[] MyArray = new double [ 10];
        //creating an var "input" that accepts numbers with inputStream " in"
        java.util.Scanner input = new java.util.Scanner( System.in);
        
        System.out.println("Enter " + MyArray.length + " Values.");

        for ( int num = 0; num < MyArray.length; num++ )
        {
            //assigning the user's numbers into the array with input " nextDouble"
            MyArray[ num] = input.nextDouble();
        }

        System.out.println("The values are : ");
        for ( int num = 0; num < MyArray.length; num++)
        {
            // printing out the values stored as of type double
            System.out.println( MyArray[num] + " ");
        }

    }
}