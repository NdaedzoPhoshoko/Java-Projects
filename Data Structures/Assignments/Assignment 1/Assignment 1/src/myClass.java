/*

Authur  : Ndaedzo Phoshoko
Student No: 20*****
Date: 12-April-2022

Project: 
Prompt the user for an input value and try the Math.sqrt() method on
it. An application that throws and catches an ArithmeticException 
when you attempt to take the square root of a negative value. 
The application either displays the square root or catches the thrown Exception
and displays an appropriate message

*/
import java.util.Scanner;

public class myClass
{
    public static void main(String[] args)
    {
        //variable declaration
        String tokens;
        double value;
        double result = 0;

        //objects declaration
        Scanner input = new Scanner(System.in);
        ArithmeticException arithmetic = new ArithmeticException();

        //prompt the value from the user
        System.out.print("Enter the value: ");
        tokens = input.nextLine();
        input.close(); //close the Scanner object
        value = Double.parseDouble(tokens);
        
        try
        {
            if(value < 0)
            {
                throw arithmetic ; //throw exception by hand
            }else
                {
                    result = Math.sqrt(value); //expression to verify
                    System.out.print("Sqrt("+ value + ") = " + result); //Sqrt(16.0) = 4.0
                }
        }catch(ArithmeticException error)  //if the value is negative catch the error 
        {
            System.out.print("Error: Square root input not accepted"); //print the error
        }finally
        {
            System.out.print("\n\nThank you.");
        }
        
    }
}

