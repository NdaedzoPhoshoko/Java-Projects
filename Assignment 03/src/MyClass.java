/*Write a Java application that allows a user to enter student data that consists of a Student number
 * First name, Surname, and average assignment mark.
 *  Depending on whether the studentâ€™s average assignment mark is at least 50,
 * output each record either to a file of students who passed (call it pass.txt) 
 * or students qualifying for supplementary (call it supp.txt).
  */

import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;


public class MyClass
{
    public static void main( String[] var) throws Exception
    {
        //accepting user's deatils
        Scanner input = new Scanner( System.in);

        System.out.print("Enter Student number : ");
        int studentNumber = input.nextInt();

        input.nextLine();

        System.out.print("Enter First Name : ");
        String firstName = input.nextLine();

        System.out.print("Enter Surname : ");
        String surName = input.nextLine();

        System.out.print("Enter Average Assignment Mark : ");
        double averageAssignmentMark = input.nextDouble();

        String fileName = "";
        
        if (averageAssignmentMark < 0 || averageAssignmentMark > 100 )
        {
            System.out.print(" Error bounds, choose average from 0 to 100");
            System.exit(0);
        } else if ( averageAssignmentMark >= 0 && averageAssignmentMark < 50)
                  {
                     fileName = "supp.txt";
                     
                  } else
                      {
                          fileName = "pass.txt";
                          
                      }

        //creating a file
        File file = new File(fileName); //initialize File object and passing file as argument
        boolean truth = file.createNewFile();

        //inputing attributes in the file
        FileOutputStream acceptingAttributes = new FileOutputStream(file, truth);
        
        acceptingAttributes.write(("Details of student who qualify for " + fileName.substring(0,4) +"\n").getBytes()) ;//heading
        byte[] contentByte = ( studentNumber + " "+ firstName +" "+ 
        surName + " " + averageAssignmentMark).getBytes(); //converting string into bytes
        acceptingAttributes.write(contentByte);
        
        //closing the FileOutputStream
        acceptingAttributes.close();
        input.close();

    }
}