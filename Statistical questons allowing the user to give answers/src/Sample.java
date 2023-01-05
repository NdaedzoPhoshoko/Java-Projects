
/**Correct answers are
1 A or a
2 B or b
3 A or a
4 D or d
5 B or b
6 C or c 
*/


import java.util.Scanner;

public class Sample{

    public static void main(String args[]){
        
        String[] array = new String[ ]{"A","B","A","D","B","C"};
        
Scanner obj=new Scanner ( System.in);
/**before we use Scanner obj to
accept String, we should tell it
to accept strings, in this case
we use obj to invoke the method nextLine()*/

        System.out.println(" \t "+
        "STATISTICS");
        
        System.out.println("A spinn"+
        "er "+
        "is divided into 3 equal "+
        "sections, with sections "+
        "labeled 1, 2, and 3.");
        
        /**System.out.print("Enter "+
        "names in full : ");
        String name = obj.nextLine();
        */
        
        System.out.print("\n");
        System.out.print("1.What is"+
        " the probability of spinn"+
        "ing a 3 on the spinner if "+
        "you know the arrow landed "+
        "on an odd number?"+
        "\nA) 1/2"+"\nB) 1/3"+"\nC)"+
        " 3/2"+"\nD) 1\nAnswer : ");
        String answer1;
        answer1 = obj.nextLine();
        
        System.out.print("\n\n");
        System.out.print("2.What is"+
        " the probability of  getti"+
        "ng section 2 given is "+
        "odd?\nA) 2/3\nB) 0\n"+
        "C) 2/3\nD) 1/3\nAnswer : ");
        String answer2;
        answer2 = obj.nextLine();
        
        System.out.print("\n\n3.");
        System.out.print("What is "+
        "the probability of getti"+
        "ng section 1, told that t"+
        "he arrow pointed 1?"+"\n"+
        "A) 1\nB) 0\nC) 1/2\nD)"+
        " 1/3\nAnswer : ");
        String answer3;
        answer3 = obj.nextLine();
        
        System.out.print("\n\n");
        System.out.print("4.What is"+
        " the probability of getti"+
        "ng 1?\nA) 0\nB) 1\nC) 1/2"+
        "\nD 1/3\nAnswer : ");
        String answer4;
        answer4 = obj.nextLine();
        
        System.out.print("\n\n");
        System.out.print("5.What is"+
        " the probability of gettin"+
        "g an odd number?\n"+
        "A) 1/3\nB) 2/3\nC) 0\nD)"+
        " 1/2"+"\nAnswer : ");
        String answer5;
        answer5 = obj.nextLine();
        
        System.out.print("\n\n");
        System.out.print("6.What is"+
        " the probability of get"+
        "ting the 2, told that the"+
        " arrow pointed an even nu"+
        "mber?\nA) 1/2\nB) 2/3\nC) "+
        "1\nD) 1/3\nAnswer : ");
        String answer6;
        answer6 = obj.nextLine();
        
        int i = 0, j = 0, k = 0;
        //i specifies index to array starting from 0 to 5( the 6th question)
        //j collects the total answers that the user obtained correct
        //k collect the total answers the user did not obtain correct

        System.out.println(" \t "+
        "ANSWERS");
        if( answer1.equals("A") || answer1.equals("a"))
        {
            System.out.println("1."+
            "Correct");
            ++j;
        } else
        {
            System.out.println("1."+
            "Incorrect, Answer is"+
             " " + array[i]);
             ++k;
        }
        ++i;
        
        if( answer2.equals("B") || answer2.equals("b"))
        {
            System.out.println("2."+
            "Correct");
            ++j;
        } else
        {
            System.out.println("2."+
            "Incorrect, Answer is"+
             " " + array[i]);
             ++k;
        }
        ++i;
        
        if( answer3.equals("A") || answer3.equals("a"))
        {
            System.out.println("3."+
            "Correct");
            ++j;
        } else
        {
            System.out.println("3."+
            "Incorrect, Answer is"+
             " " + array[i]);
             ++k;
        }
        ++i;
        
        if( answer4.equals("D") || answer4.equals("d"))
        {
            System.out.println("4."+
            "Correct");
            ++j;
        } else
        {
            System.out.println("4."+
            "Incorrect, Answer is"+
             " " + array[i]);
             ++k;
        }
        ++i;
        
        if( answer5.equals("B") || answer5.equals("b"))
        {
            System.out.println("5."+
            "Correct");
            ++j;
        } else
        {
            System.out.println("5."+
            "Incorrect, Answer is"+
             " " + array[i]);
             ++k;
        }
        ++i;
        
        if( answer6.equals("C") || answer6.equals("c"))
        {
            System.out.println("6."+
            "Correct");
            ++j;
        } else
        {
            System.out.println("6."+
            "Incorrect, Answer is"+
             " " + array[i]);
             ++k;
        }

        System.out.println("\nYou have got " + j + " Correct Answers, "+
        "and " + k + " Incorrect Answers");
        System.out.print("\n......."+
        "Thank you.........");
        obj.close();
        /**closing of object*/
    }
}
