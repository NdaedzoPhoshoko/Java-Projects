import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class MyClass
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     Map<Integer, String> list = new HashMap<Integer, String>();
     list.put(12345, "Hey there");
     list.put(67890, "Hey there");
     list.put(23452, "Hey there brother");
     list.put(67892, "Hey there man");
     list.put(10234, "Hey there buddy");

     //Iterator<Integer> contactsIterator = list.keySet().iterator();
     Set<Integer> contacts = list.keySet();

     System.out.println("Hello, Welcome to Contacts and Messages Simulation.");

     boolean stop = false;
     while(!stop)
     {
        System.out.print("\nMain Menu:\n\t1. Manage contacts"+
                            "\n\t2. Messages\n\t3. Quit\ninput: "
        );
        int option = input.nextInt();
        String myString = "";
        switch(option)
        {
            case 1:
            {
                System.out.print("\t1. Show all contacts"+
                    "\n\t2. Add a new contact"+
                    "\n\t3. Search for a contact"+
                    "\n\t4. Delete a contact"+
                    "\n\t5. Go back to the previous menu"+
                    "\ninput: "
                );
                option = input.nextInt();
                if(option==1)
                {
                    int a=0;
                    for(Integer each: contacts)
                    {
                        a++;
                        System.out.println( a+". " +each);
                    }
                }else if(option==2)
                {
                    System.out.print("enter contact: ");
                    option = input.nextInt();
                    list.put(option, "");
                    System.out.println("Conatact added.");
                }else if(option==3)
                {
                    System.out.print("enter contact: ");
                    option = input.nextInt();
                    if(list.containsKey(option))
                    {
                        System.out.println("Contact found.");
                    }else
                    {
                        System.out.println("No such contact is found.");
                    }
                }else if(option==4)
                {
                    System.out.print("enter contact: ");
                    option = input.nextInt();
                    if(list.containsKey(option))
                    {
                        list.remove(option);
                        System.out.println("Contact deleted.");
                    }else
                    {
                        System.out.println("No such contact is found.");
                    }
                }else
                {
                    stop = false;
                }
            }break;
            case 2:
            {
                System.out.print("\t1. See the list of all messages"+
                    "\n\t2. Send a new message"+
                    "\n\t3. Go back to the previous menu"+
                    "\ninput: "
                );
                option = input.nextInt();
                if(option==1)
                {
                    if(list.isEmpty())
                    {
                        System.out.println("No messages found.");
                    }else
                    {
                        /*java.util.Iterator<Integer> iterator= contacts.iterator();
                        int b=0;
                        for(Integer each: contacts)
                        {
                           b++;
                           int myKey = iterator.next();
                           System.out.println(b+ ". "+ myKey + ", message: "+ list.get(myKey));
                        }*/
                        int b=0;
                        for(Integer each: contacts)
                        {
                           b++;
                           System.out.println(b+". "+ each+ " message: "+ list.get(each) );
                        }
                        System.out.println("end of messages.");
                    }
                }else if(option==2)
                {
                    //TODO fix this
                    /*
                     * Method nextLine() is being ignored after nextInt()
                     * used next()
                     */
                    System.out.print("Enter contact: ");
                    option = input.nextInt(); // considered
                    if(!list.containsKey(option))
                    {
                        System.out.print("Enter message: ");
                        myString = input.next(); //ignored
                        list.put(option, myString);
                    }else
                    {
                        System.out.print("Enter message: ");
                        myString = input.next();  //ignored
                        list.replace(option, list.get(option), myString);
                    }
                }else if(option==3)
                {
                    stop = false;
                }
            }break;
            case 3:
            {
                System.out.println("Thank you.");
                stop = true;
            }break;

            default: System.out.println("Wrong option, Try again\n");
        }
    }

        input.close();
    }
}