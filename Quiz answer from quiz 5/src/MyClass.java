public class MyClass{
    public static void main( String[] args) {
        /**int[] MyArray = { 1, 2, 3, 4};

        int[] MyArray1 = MyArray;

        MyArray = new int[2];

        for ( int num = 0; num < MyArray.length; num++)
        {
           System.out.print( MyArray[ num] + " ");
           
        }*/

        int[] myList= { 1, 2 , 3, 4, 5, 6};
        for ( int i = myList.length-2 ; i >= 0 ;i--)
        {
             myList[ i + 1] = myList[ i];
        }

        for ( int e : myList)
        {
            System.out.print( e + " ");
        }


        
    }
}