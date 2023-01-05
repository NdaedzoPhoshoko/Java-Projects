/*
Author:
Date:
STudent number:
Project: Using the Math.sqrt(value) fucntion on a user value
*/
import java.util.Scanner; //including the Scanner for user input
public class NewClass {
    public static void main(String[] args) throws ArithmeticException
    {
        //variable declaration
        String random_input;
        double num;  //variable to store the user value
        try{ //monitoring errors
            Scanner input = new Scanner(System.in); //openning an input Object
            
            System.out.print("\nEnter the number: "); //prompting the user for input
            random_input = input.nextLine();

            //covert the user input to type Double
            num = Double.parseDouble(random_input);

            input.close(); //closing the input Object
            if(num > 0)
            {
                double root = Math.sqrt(num);
                System.out.println("\nThe square root of " + num + " is " + root);
            }
            else if(num <0) //restricting the code to catch an error, assume that number is negative
            {
                throw new ArithmeticException();
            }
        } catch(ArithmeticException e) { //catching the detected error
            System.out.println("Can't take the square root from a negative number\n\n");
        }

    }
   
}

