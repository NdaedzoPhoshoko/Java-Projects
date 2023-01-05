public class myClass
{
    public static void main(String[] args) {
        System.out.println("1,-1,0,2,-1");
        int[] myArray = {1,-1,0,2,-1};
        int[] collect = new int[30];

        int sum =0;
        for(int i=0;i<myArray.length; i++ )
        {
            sum = myArray[i];
            collect[i] = myArray[i]; //
            for(int j=0;j<myArray.length;j++)
            {
                if(i != j)
                {
                    sum += myArray[j];
                    collect[i+1] = myArray[j];
                    for(int k=0;k<myArray.length;k++)
                    {
                        if(j != k && (sum+myArray[k] == 0))
                        {
                            sum+= myArray[k];
                            collect[i+2] = myArray[k];
                        }
                    }
                }
            }
        }
        System.out.print("sum: " + sum + "\nValues are: ");
        int newline = 0;
        for(int p = 0; p< collect.length; p++, newline++)
        {
            if(newline % 3 == 0)
            {
                System.out.println();
            }
            System.out.print(collect[p] + ", ");
        }
    }
}