import java.util.Scanner; //importing the Scanner class for inputs

public class myClass
{
    public static void main(String[] args)
    {
        //drive here
        /*
        Create a project that asks the user for integers, then the program shall sum the integers entered,
        And also compute the average
        Then display the integers, the sum and the average(mean)
        */

        /*
        how many intergs? 4
        integer 1: 23
        integer 2: 23
        integer 3: 100
        integer 4: 05

        sum = integer1+integer2+integer3+integer4;
        av = sum/numberOfintegers;
        */
        Scanner input = new Scanner(System.in); //open the input

        System.out.print("How many integers? "); //promt user integers
        int numberOfintegers = input.nextInt(); //4

        int[] myIntegers = new int[numberOfintegers];  //memory allocation, increases as we add elements

        for(int i = 0; i < numberOfintegers; i++)  //i= 0 1 2 3 4
          {
                System.out.print("integer "+(i+1)+ ": ");
                myIntegers[i] = input.nextInt();
          }

        double sum = 0;
        for(int i = 0; i < myIntegers.length; i++)
        {
            sum += myIntegers[i];  // sum = sum + myIntegers[i];
        }

        double average = sum/myIntegers.length;  // int average = sum/numberOfIntegers;
        //note that sum is double and myIntegers is an integer, but their devision results a double
        /*
        Integers: 12,23,45,67,
        Sum : 100
        Average : 14
        */

        System.out.print("Integers: ");
        for( int Each: myIntegers)  //for each loop is used to display values in arrays or containers
        {
            System.out.print(Each + ",");
        }
        System.out.println("\nSum : " + sum);
        System.out.print("Average : "+ average);

        input.close();
        
    }
}
/*Alternatives

        for(int i = 0; i < numberOfIntegers; i++)
        {
            System.out.print(myIntegers[i] + ",");
        }

        int a = 0;
        while(a < numberOfIntegers)
        {
            System.out.print(myIntegers[a] + ",");
            a++;  //a = a + 1;
        }

        int b = 0;
        do
        {
            System.out.print(myIntegers[b] + ",");
            b++;  //  b = b + 1;
        }while(b< myIntegers[b] )

        int c = 0;
        loop1:
        {
            System.out.print(myIntegers[c] + ",");
        }
        while(c < numberOfIntegers)
        {
            goto loop;
            c++; // c = c + 1;
        }
        */
