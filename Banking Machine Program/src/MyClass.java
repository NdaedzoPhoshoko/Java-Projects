//BANKING MACHING
/*
Code does the following
0 validate account
1 view balance
2 deposit
3 withdraw
4 change pin
*/
import java.util.Scanner;
class MyClass {
    static Scanner input = new Scanner(System.in); /*if scanner is made static, this prevents declaring many of them
    which may lead to unneccessary "NoSuchElementException" */
    public static void main(String[] args) {
        String[][] accounts = {  //[4 rows][3 columns]
            {"12345", "12Ab@", "300"},
            {"54321", "Rt3@c", "30000.99"},
            {"67890", "Bxb2@", "2955"},
            {"19876", "ov#3c", "405.50"}
        };
        System.out.print("\n\tHello, Welcome to the Banking App\n"+
        "Enter Bank Acc No: ");
        int accountNo = input.nextInt(); //collecting user acc no

        int index =0;//keeping this makes us trace the acc no, pin and balance
        //validate the acc no
        boolean isAccFound = false, isPinFound = false;
        for(int a=0; a<accounts.length; a++)
        {
            if(accounts[a][0].equals(Integer.toString(accountNo))) //check if acc no is found
            {
                isAccFound = true;
                System.out.print("Enter Pin: ");
                input = new Scanner(System.in); //initializing input to accept different type
                String pin = input.nextLine(); //collecting pin
                if(accounts[a][1].equals(pin))
                {
                    isPinFound = true;
                    index = a; //keeping this makes us trace the acc no, pin and balance
                }
                break; //stop if acc no is found
            }
        }
        if(isAccFound == false) //assuming not found
        {
            System.out.print("Account No not found. Thank you");
        }else{  //assuming acc number is found
         
            //validate pin 
            if(isPinFound == false)
            {
                System.out.print("Pin code wrong. Thank you");
            }else{
                boolean stopMe = false;
            while(!stopMe)
            {
                displayMenu(); //display menu
                System.out.print("\toption: ");
                int option = input.nextInt();
                if(option > 0 && option < 6) // 1 2 3 4 5
                  {
                     stopMe = subMenu(accounts, option, index); //call subMenu
                  }else{
                     System.out.print("Wrong option, Thank you");
                    }
            }
          }
        }
        input.close(); //close Scanner
    }
    static void displayMenu()
    {
        System.out.println(
            "\n\t...MENU...\n"+
            "1. View Balance\n"+
            "2. Deposit\n"+
            "3. Withdrawal\n"+
            "4. Change Pin\n"+
            "5. exit\n"
            );
    }
    static boolean subMenu(String[][] accounts, int option, int index)
    {
        boolean t = false;
        switch(option)
            {
                case 1:
                    System.out.println("Balance remaining: R"+ accounts[index][2]);
                    break;
                case 2:
                    accounts = debosit(accounts, index);
                    break;
                case 3:
                    accounts = withdraw(accounts, index);
                    break;
                case 4:
                    accounts = changePin(accounts, index);
                    break;
                case 5:
                    System.out.println("\n\tThank you");
                    t =  true; //stop engine
                    break;
                default:
                    System.out.print("Option not found. Thank you");
            }
        return t;
    }

    static String[][] debosit(String[][] accounts, int index) //method for debosit
    {  //debositAmount is added to the bank array for accountants
        System.out.print("Enter amount: "); //prompt user for debosit amount
        String strAmount = input.next();
        double newBalance = Double.parseDouble(strAmount) + Double.parseDouble(accounts[index][2]);
        accounts[index][2] = Double.toString(newBalance); //storing newBalance into previous balance
        System.out.println("Debosited amount of R"+ strAmount+ " into account.");
        return accounts;
    }

    static String[][] withdraw(String[][] accounts, int index)
    {
        System.out.print("Enter amount: "); //prompt user for withdrawal amount
        String strAmount = input.next();
        double newBalance = Double.parseDouble(accounts[index][2]) - Double.parseDouble(strAmount);
        accounts[index][2] = Double.toString(newBalance); //updating new balance
        System.out.println("Withdrawal amount of R"+ strAmount+ " has been made.");
        return accounts;
    }

    static String[][] changePin(String[][] accounts, int index)
    {
        //change the pin
        System.out.print("Enter new pin: "); //prompt user for withdrawal amount
        accounts[index][1] = input.next();
        System.out.println("Pin updated successfully.");
        return accounts;
    }
}