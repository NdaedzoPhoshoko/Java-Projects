public class MyClass{
    public static void main ( String [] args)
    {
        double[] MyArray = new double [ 10];
        for ( int num = 0; num < MyArray.length; num++ )
        {
            /*
            We use the class "Math" with the method "random()" for random numbers
            the random() method returns values of type double
            */
            MyArray[ num] = Math.random() * 100;
        }

        System.out.println("\n The values are : \n");
        
        for ( int num = 0; num < MyArray.length; num++)
        {
            System.out.println( MyArray[ num]);
        }
        System.out.println("\n");


        //for summing up all values in the array

        double total = 0.0;
        for ( int num = 0; num < MyArray.length; num++)
        {
            total += MyArray[ num];
        }

        System.out.println("\n" + "Total is : " + total);
        
    }
}