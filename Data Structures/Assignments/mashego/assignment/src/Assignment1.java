/*
Author: Ntsoane Mashego Evidence
Student No: 202120310
Date: 11 April 2022
Project: Prompting user input and using Math.Sqrt(value) method
*/
import java.util.Scanner; //targetting the Scanner class for user input

public class Assignment1{

   public static void main (String[]args) throws Exception
   {
      double number; //Declaring variables
      double SquareRootOfNumber;
      String UserInput;
      Scanner scanner = new Scanner (System.in); //opening an input Object
 
      System.out.print("\n\n\nEnter number: "); //prompting the user for input
      UserInput =scanner.nextLine();

      scanner.close(); //closing the input Object

      number =Double.parseDouble(UserInput); //parsing userInput to a valid type double

      try
      {
         //validy of userInput, if user enters a negative value
         if (number < 0) {
            //error to display when number is negative
            throw new ArithmeticException(" No solution for square root of negative number\n\n\n");
         }else
         {
            SquareRootOfNumber = Math.sqrt(number); //computing the square root of user value
            //assume if number > 0 then display the sqrt(number)
            System.out.format("\nSquare root of "+ number+ " = " + SquareRootOfNumber+"\n\n\n");
         }
      }catch(ArithmeticException error)
      {
         System.out.print("\n\nError:"+ error.getMessage()); //display the error
      }
   }
}