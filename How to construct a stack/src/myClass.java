/*create a program that store five names of movies to the stack list
remove the top name from the list
searches if the name of the movie is in the stack
*/
import java.util.Stack;
import java.util.Scanner;

public class myClass
{
    public static void main(String[] args)
    {
        //...
        Stack<String> movieNames = new Stack<String>();
        movieNames.push("The Alchemist");
        movieNames.push("The Mummy");
        movieNames.push("The Lord of the Rings");
        movieNames.push("The Hobbit");
        movieNames.push("Vikings");

        System.out.println("The movie names in the stack: " + movieNames);
        
        //removing the name of the movie, always removes from the top
        /*
        String movieName;
        Scanner myInputObject = new Scanner( System.in);
        System.out.print("Enter the name of the movie you want to remove: ");
        movieName = myInputObject.nextLine();
        movieNames.remove(movieName);  //this will remove the any of the movie names
        myInputObject.close();
        */

        /*
        //for removing the element at the top of the stack
        String removedElement = movieNames.pop(); // this will remove the top element of the stack
        String removedElement2 = movieNames.pop();
        System.out.println("The movie name removed from the stack: " + removedElement + " and " + removedElement2);
        */

        System.out.println("The movie names in the stack: " + movieNames);

        /*
        //display in reverse
        System.out.println("The movie names in the stack in reverse order: ");
        int size = movieNames.size();
        for (int i = 0; i < size; i++)
        {
            System.out.print(movieNames.pop() + ", ");
        }
        */
        
        //searching for the movie name
        System.out.print("\nEnter the name of the movie you want to search: ");
        Scanner myInputObject1 = new Scanner( System.in);
        String movieName = myInputObject1.nextLine();
        if (movieNames.contains(movieName))
        {
            System.out.println("The movie name is in the stack");
        }
        else
        {
            System.out.println("The movie name is not in the stack");
        }
        myInputObject1.close();

            
        
    }
}
