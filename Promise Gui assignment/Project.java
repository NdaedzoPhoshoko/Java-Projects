import javax.swing.JOptionPane;

public class Project {
  
   public static int getInput(String msg) {
       String input=JOptionPane.showInputDialog(msg);
       try {
           int val = Integer.parseInt(input);
           return val;
       }catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Please enter valid integer value!");
           return getInput(msg);
       }
   }

   public static void main (String[] args) 
   {
       int size = getInput("Enter how many integers ");
       int data;
       int array[] = new int[size];
       for (int i = 0; i < size; i++) {
           data = getInput("Enter element "+(i+1)+" : ");
           array[i] = data;
       }

       String result="Array from first to last : ";
       int min=array[0];
       int max=array[0];
       int total = 0;
       for (int i = 0; i < size; i++) {
           result+=array[i]+" ";
           if(min>array[i]) {
               min=array[i];
           }
           if(max<array[i]) {
               max=array[i];
           }
           total += array[i];
       }
       result +="\n";
      
       
       result+="Array from last to first : ";
       for (int i = size-1; i >= 0; i--) {
           result+=array[i]+" ";
       }

       Project obj = new Project();
       double number;
       number =  obj.nameOfFunction( total, size);


       result +="\n";
       result+="\nMinimum is : "+min;
       result+="\nMaximum is : "+max;
       result+="\nTotal is : "+total;
       result+="\nAverage is : "+number;
       JOptionPane.showMessageDialog(null, result);
       

       
   }

   double nameOfFunction( double a, double b)
   {
       double average = a/b;
       return average;
   }
}