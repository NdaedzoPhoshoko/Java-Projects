/**
 * Write a Java program to prints the current time in GMT
 * Test data 
 * input the time zone offset to GMT: 256
 * Expected ouput: Current Time is 23:40:24
 */

 /*
 What is GMT?
 GMT means Greenwhich Mean Time Zone, GMT is the mean solar time at the Royal Observatory in Greenwhich, London
 if we say London is 256 offset behind from Limpopo, it is GMT-256 
 if we Limpopo is 1 offset ahead of London GMT  means limpopo time is GMT+1
 What is offset?
 Offset means number of minutes from a certain time zone
 */


import java.util.Scanner;

 public class MyClass
 {
     public static void main( String[] myArray) throws Exception
     {
        TimeClass objectOfTimeClass = new TimeClass();
        int hours = objectOfTimeClass.myHours; //getting curr hours
        int minutes = objectOfTimeClass.myMinutes;  //getting curr hours
        int seconds = objectOfTimeClass.mySeconds;  //getting curr seconds

        Scanner objectScanner = new Scanner( System.in);
        //collecting offset from the user
        System.out.print("input the time zone offset to GMT: ");
        int offset = objectScanner.nextInt();

        //getting offset to GMT
        hours = hours + (offset)/ 120; //local time in hours
       
        //for seconds and minutes, they stay literal for current time since they are not included in offset
         
        //printing the current time
        System.out.println("Current Time is " + hours + ":" + minutes + ":" + seconds);
        //closing the objectScanner
        objectScanner.close();

     }
 }