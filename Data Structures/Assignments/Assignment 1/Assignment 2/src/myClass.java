/*
Author: Phoshoko N
Student No: 20*****
Date: 12-April-2022
Project: A program that allows a user to input customer records 
such as (ID number, first name, last name, and balance owed) 
And save each record to a file.
*/

import java.util.Scanner;
import java.io.File; //include the file class for creating a new file
import java.io.FileOutputStream; //include the FileOutputStream for writing the file
import java.text.DecimalFormat;

public class myClass
{
    public static void main(String[] args) throws Exception
    {
        //Variable declaration
        boolean validator;
        long ID_number = 0; // datatype long allows more than 13 SA ID digits
        int no_of_customers, counter = 1; //counter points to customber record
        String first_name, last_name, ammount, pseudo_ID; 
        double balance_owed;
        
        //Object declarations;
        //Open a file
        File myFile = new File("Customer Records.txt"); // text file called "Customer Records"
        FileOutputStream writer_obj;
        Scanner input = new Scanner(System.in); //object for collecting input from the keyboard
        DecimalFormat rounder = new DecimalFormat("####.##"); //ammounts will be rounded to two decimal point

        validator = myFile.createNewFile(); //create a new empty file for customer records
        if(validator == false)  //if the file is successfully created
        {
            System.out.println("File Already Exist, Continue to Modify...\n");
        }
                writer_obj = new FileOutputStream(myFile.getPath(), true); //creating a writer that writes file myFile

                System.out.print("How many customers: "); //collect the number of customers
                no_of_customers = input.nextInt();

                writer_obj.write("Customer Records\n".toUpperCase().getBytes()); //title for the file

                input.nextLine(); //trigger the compiler for accepting the strings
                for(int i = 0; i < no_of_customers ; i++, counter++)
                {
                    System.out.println("\nCustomer "+ counter);//collect the full customer record
                    System.out.print("Enter 13-digit ID: ");
                    pseudo_ID = input.nextLine();  //collect ID

                        if(pseudo_ID.length() != 13) //verify 13 digits
                        {
                            System.out.print("ID not allowed, try again");
                            i = no_of_customers; //halt the loop
                        }else
                            {
                                ID_number = Long.parseLong(pseudo_ID); //convert pseudo_Id to actual ID of type Long
                                System.out.print("Enter First Name: ");
                                    first_name = input.nextLine();  //collect first name
                                    System.out.print("Enter Last Name: ");
                                    last_name = input.nextLine();  //collect last name
                                    System.out.print("Enter balance owed: ");
                                    ammount = input.nextLine(); //collect balance owed

                                //write the customer record into the file
                                writer_obj.write(("\nCustomer "+ counter + "\n").getBytes());
                                writer_obj.write(("ID number   : "+ID_number+"\n").getBytes());
                                writer_obj.write(("First Name  : "+first_name+"\n").getBytes());
                                writer_obj.write(("Last Name   : "+last_name+"\n").getBytes());
                                balance_owed = Double.parseDouble(ammount);
                                writer_obj.write(("Balance Owed: R"+rounder.format(balance_owed)+"\n").getBytes());
                            }
                }
                writer_obj.close();
           input.close();
    }
}