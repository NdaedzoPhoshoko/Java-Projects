 public class MyClass {
     public static void main ( String [] args)
     {
         int[] MyArray = new int[ 10];

         int Count = 1;
         for ( int num = 0; num < MyArray.length; num++)
         {
             MyArray[ num] = Count;
             Count++;
         }

         // copy MyArray values to another array of the same type
         //line 13 - 20
         int[] MyArray1 = new int[MyArray.length];

         int num1 = 0;
         while ( num1 < MyArray.length)
         {
             MyArray1[num1] = MyArray[num1];
             num1++;
         }

         Count = 1;
         for ( int num = 0; num < MyArray.length; num++)
         {
             System.out.println("Value " + Count + " Is " + MyArray1[ num]);
         }
     }
 }