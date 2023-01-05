import java.util.Scanner;
public class myRandomGenerator
{
    public static void main(String[] args)
    { //drive here
        int num1, num2; //var declaration
        int answer;
        Scanner input = new Scanner(System.in); //openning an input

        num2 = (int)(Math.random()*10); //generate num2
   boolean control = true;
    do
    {
        //converting from double to integer e.g 0.4 to 4
        num1 = (int)(Math.random()* 10);  // >=0.0 && <10.0 signle digit
        if(num1 >= num2) //only ask the questions, when num1>num2
        {
            control = false; //it found the correct values to ask
        }
    }while(control == true);

    System.out.print("What is "+ num1+"-"+num2+ "? ");
    answer = input.nextInt(); //collect the input from the child

    if(answer == (num1-num2))
    {
        System.out.print("\nCorrect!!!");
    }else
       {
        System.out.print("\nIncorrect, correct answer is "+ (num1-num2));
       }

    /*
    control = true;
    while(control == true)
    {....}

    control = true;
    while(control)
    {....}

    */
    input.close();  //close the input
        
    }
}