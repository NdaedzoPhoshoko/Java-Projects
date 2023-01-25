// Proper positive divisor that equals to N
//Say yes if N==proper positive divisor, else NO
public class Challenge1 {
    public static void main(String[] args) {
        //start here
        int[] arr = {6,3,28};
        for(int a=0; a<3; a++)
        {
            System.out.println(Solve(arr[a]));
        }
        
    }

    static String Solve(int N)
    {
        int sum = 0;
        for(int b=1; b<N; b++) //proper divisor excludes integer N
        {
            if(N%b==0)
            {
                sum+=b; //collect integer if its a divisor of N
            }
        }
        if(sum==N)
            {
                return "YES";
            }else{
                return "NO";
            }
    }
}
