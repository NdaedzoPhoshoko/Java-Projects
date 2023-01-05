public class operators {
    public static void main(String[] args)
    {
        int number = 10;
        if((number%2==0) && (number%3==0))  // 4%2 remainder 4/2 = 2.0 -2 = 0.0*2 = 0
        {//e.g 6 is both, 6/2 = 3 remainder is 0, and also 6/3 = 2 remainder is 0
            System.out.print(number + " is divisible by both 2 & 3");
        }else if((number%2==0) || (number%3==0))
             {
                System.out.print(number + " is divisible by 2 or 3");
             }else if( ((number%2==0) || (number%3==0)) ^ ((number%2==0) && (number%3==0)) ) //whether a number is divisible by 2 or 3 but not both:
                 {     // 8
                         // (T || F) ^ (T && F)
                         System.out.print(number + " is divisible by 2 or 3 but not both");
                 }
    }
}
//3%2 3/2 = 1.5 -1= 0.5*2 = 1
/*
 if( ((number%2==0) || (number%3==0)) && !((number%2==0) && (number%3==0)) ) //whether a number is divisible by 2 or 3 but not both:
                 {     // 8
                         // (T || F) && !(T && F)
                         System.out.print(number + " is divisible by 2 or 3 but not both");
                 }
*/