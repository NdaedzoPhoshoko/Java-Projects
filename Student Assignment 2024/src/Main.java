import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("\tWELCOME TO THE VOTING PROGRAM\nEnter your name: ");
        String username = myObj.nextLine();
        System.out.print("Enter your age: "); 
        int user_age = myObj.nextInt();
        myObj.close();
        isAllowed(username, user_age);
    }

    public static void isAllowed(String name, int age)
    {
        if(age >= 18)
        {
            System.out.println(name+ ", you are eligible to vote.");
        }else{
            System.out.println(name+ ", you are not eligible to vote..");
        }
    }
}
