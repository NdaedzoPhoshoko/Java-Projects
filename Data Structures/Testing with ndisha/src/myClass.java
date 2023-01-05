import java.util.Scanner;

public class myClass
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);
       //gross profit + income less expenses = earning before interest and tax
       double gross_prof = 0, closing_stock = 0; 
       double income = 0, purchases = 0, expenses = 0, prof_of_asset = 0, rental = 0;
       double earnings = 0, cost_of_sales = 0, sales = 0, opening_stock = 0;
       
       cost_of_sales = 10.0 + Math.random() * 1000; //auto sales

       String convert;
       //list of  expenses
       double water_and_elect = 0, telephone = 0, salaries = 0;

       System.out.print("\n\nThe program for Earnings\n\n");
       System.out.print("Enter the sales: R");
       //collect the sales 
       convert = myInput.nextLine();
       sales = Double.parseDouble(convert);

       System.out.print("Enter the Op Stock: R");
       convert = myInput.nextLine();
       opening_stock = Double.parseDouble(convert);

       System.out.print("Enter the purchases: R");
       convert = myInput.nextLine();
       purchases = Double.parseDouble(convert);

       System.out.print("Enter the closing stock: R");
       convert = myInput.nextLine();
       closing_stock = Double.parseDouble(convert);

       System.out.print("Enter the profit of asset: R");
       convert = myInput.nextLine();
       prof_of_asset = Double.parseDouble(convert);

       System.out.print("Enter the Rental: R");
       convert = myInput.nextLine();
       rental = Double.parseDouble(convert);

       System.out.print("\nCollecting Expenses\n");
       System.out.print("Enter the water&electricity cost: R");
       convert = myInput.nextLine();
       water_and_elect = Double.parseDouble(convert);

       System.out.print("Enter the telephone cost: R");
       convert = myInput.nextLine();
       telephone = Double.parseDouble(convert);

       System.out.print("Enter the salaraies: R");
       convert = myInput.nextLine();
       salaries = Double.parseDouble(convert);

       expenses = water_and_elect + telephone + salaries;

       //how to find gross profit
       cost_of_sales = opening_stock + purchases - closing_stock; //find cost_of_sales
       gross_prof = sales - cost_of_sales;  //find gross

       //how to find income
       income = prof_of_asset + rental;
       earnings = gross_prof + income - expenses;

       //displaying the result
       System.out.println("Loading....\n\n\tCost of Sales(given) is R" + cost_of_sales);
       System.out.print("\tGross profit is R" + gross_prof);
       System.out.println("\tIncome is R" + income);
       System.out.println("\tExpenses is R" + expenses +"\n\n");
       System.out.println("\tExpenses is R" + earnings +"\n\n");

       myInput.close(); //closing the scanner

    }

}