/**
 * Create a program that ask the user to enter six INTEGER  numbers separated by space.
 * Then store the numbers in a Vector and print the sum of the first, the fourth and sixth numbers.
 */
public class myClass
{
    public static void main(String[] args) throws Exception
    {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter six numbers separated by space: ");
        Integer[] myArray = new Integer[]{ scan.nextInt(), scan.nextInt(),
            scan.nextInt(), scan.nextInt(),
            scan.nextInt(), scan.nextInt() };
 
        java.util.Vector<Integer> v = new java.util.Vector<Integer>();
        v.addElement(myArray[0]); //0
        v.addElement(myArray[3]);  //1
        v.addElement(myArray[5]);  //2


        v.trimToSize();

        int sum = v.elementAt(0) + v.elementAt(1) + v.elementAt(2); // 0 3 5
        System.out.println("\n" +sum);
        scan.close();
    }
    
}
