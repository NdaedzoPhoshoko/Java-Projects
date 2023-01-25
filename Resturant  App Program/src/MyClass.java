/* Online Java Compiler and Editor */

/*
 Robot that takes order
  - Welcomes a user
  - Takes userName
  - Display a list of food/ menu
  - Allow user to pick a choice
*/
import java.util.Scanner;

public class MyClass{
     public static void main(String []args){
        System.out.print("Welcome to Resturant BigMenuRes\n");
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name: ");
        String customerName = input.nextLine();//Collecting user name
        boolean stop = false;
        while(stop == !true)
        {
            displayMenu(); // displaying menu
            System.out.print(customerName+ ", What would you like to have? ");
           int choice = input.nextInt();
           //controling the engine
           stop = userChoices(choice); //calling subMenu
           
        }
        input.close();
     }
     
     static void displayMenu()
     {
         System.out.println(
            "\nBigMenuRes\n1. Burger - $9.99\n"+
             "2. Big Burger - $11.99\n"+
             "3. exit\n");
     }
     static boolean userChoices(int choice)
     {
         Scanner input2 = new Scanner(System.in);
         int numOfProd;
         double sumPrice;
         boolean a = false;
         switch(choice)
         {
             case 1:
                System.out.print("Selecting Burger - $9.99\n"+
                "How many Burgers do you want? ");
                numOfProd = input2.nextInt();
                System.out.print("You've ordered "+ numOfProd+ " x - Burger \n");
                sumPrice = numOfProd * 9.99;
                System.out.print("Total price: $"+ sumPrice);
             break;
             case 2:
                System.out.print("Selecting Big Burger - $11.99\n"+
                "How many Big Burgers do you want? ");
                numOfProd = input2.nextInt();
                System.out.print("You've ordered "+ numOfProd+ " x - Big Burger \n");
                sumPrice = numOfProd * 11.99;
                System.out.print("Total price: $"+ sumPrice);
                break;
             case 3:
                 System.out.print("\n\tThank you...");
                 a= true;
                 break;
             default: System.out.print("Wrong option, Thank you");
             break;
         }
         input2.close();
         //controling the engine
         if(a==true)
         {
             return true;
         }else{
         return false;
         }
         
     }
}