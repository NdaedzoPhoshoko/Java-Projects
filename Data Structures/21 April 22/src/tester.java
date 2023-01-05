public class tester {
    public static void main(String[] args) {
        //declare an object of type string
        String var;
        //assign variable var with value 12.5
        var = "12.5";
        System.out.print(var); //print 12.5
        //declare an object of type integer
        int myInt;
        //assign variable myInt with var
        myInt = Integer.parseInt(var) ;  //converting a String to an Integer
        System.out.print(myInt); //print 12
    }
}

/*
Type casting
example1
        double b = 12.5;
         int a = (int)b;  //a = 12  b = 12.5

example2 
        int a = 12;
        String b = a.toString();

example3
        String b = "12.5";
        int a = Integer.parseInt(b);  //  a = 12  b = "12.5"
*/
