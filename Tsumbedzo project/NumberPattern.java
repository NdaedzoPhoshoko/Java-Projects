import java.util.Scanner;

public class NumberPattern
{
    public static void main(String[] Tman)
    {
        int numPattern, a, b, c, d, e, dif1,dif2,dif3,dif4;

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number pattern you want \n 1 Arithmatic \n 2 Geometric \n 3 Quadratic \n 4 Exponential ");
        numPattern = number.nextInt();

        switch (numPattern)
        {
            case 1: 
            System.out.println("Welcone to arithmatic pattern \n Enter five numbers ");
            a = number.nextInt();
            b = number.nextInt();
            c = number.nextInt();
            d = number.nextInt();
            e = number.nextInt();

            dif1 = b - a; dif2 = c - b; dif3 = d - c; dif4 = e - d;

            if((dif1 == dif2) && (dif2 == dif3) && (dif3 == dif4))
            {
                //print the arith
                System.out.println("Arithmetic verified!");
            }else { System.out.print("The sequence is not arithmetic!"); }
                break;

            case 2:
            System.out.println("Welcone to geometric pattern \n Enter five numbers ");
            a = number.nextInt();
            b = number.nextInt();
            c = number.nextInt();
            d = number.nextInt();
            e = number.nextInt();

                break;

            case 3:
            System.out.println("Welcone to quadratic pattern \n Enter five numbers ");
            a = number.nextInt();
            b = number.nextInt();
            c = number.nextInt();
            d = number.nextInt();
            e = number.nextInt();

                break;

            case 4:
            System.out.println("Welcone to exponential pattern \n Enter five numbers ");
            a = number.nextInt();
            b = number.nextInt();
            c = number.nextInt();
            d = number.nextInt();
            e = number.nextInt();

                break;
        
            default:
                break;
        }
        
        number.close(); //close the number object
    }
}