/**
 * Generate 100 lowercase letters randomly and assign the to an array of characters
 * Count the occurance of each letter
 */

 //importing the array that generates random letters
 import java.util.Random;

public class MyClass
{
    public static void main( String[] args)
    {
        //assigning the characters to the array myArray
        char[] myArray = myMethodCharacters();

        int i = 0;
        int j = 0;
        int k = 0;
        for ( i = 0; i < 5; i++)
        {
            for( j = 0; j < 20; j++, k++)
            {
                System.out.print( myArray[ k] + " ");

            }
            System.out.print("\n");
        }
       

    }

    /**Create the method that generates 100 characters that assigns them to the array */
    public static char[] myMethodCharacters()
    {
        char myArrayCharacters[] = new char[ 100];

        Random random = new Random();

        for( int num = 0; num < myArrayCharacters.length ; num++)
        {
            //int variable that carry 26 space of integers random
            int character = random.nextInt(26);

            //casting integers to char and assigning them to the array
            myArrayCharacters[ num] = (char)(character + 97);
        }

        return myArrayCharacters;
    }

}