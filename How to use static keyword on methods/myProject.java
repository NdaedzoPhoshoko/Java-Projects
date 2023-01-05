public class myProject
{
    public static void main(String... args)
    {
        //myProject ob = new myProject();
        calculator(12.60, 20.40);
    }
    static void calculator(double var1, double var2)
    {
        double sum = var1+var2;
        System.out.println("sum of "+var1+"+"+var2+" = "+ sum);
    }
}
