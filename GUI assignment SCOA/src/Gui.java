//import javax.print.attribute.standard.JobHoldUntil;

import javax.swing.JOptionPane;


public class Gui {



    private double averagenumber;

    public static void main(String[] args) throws Exception {
        
        new Gui();  
        String responce ;
        responce = JOptionPane.showInputDialog(" how many integers do you want to store ");
        int n = Integer.parseInt(responce) ;
       
        int[] matt=new int[n] ;

 for(int i=0 ; i<n ; i++)
 {
     responce= JOptionPane.showInputDialog("enter your integers");
     matt[i]=Integer.parseInt(responce);
 }

 String values = " Your integers from first to last are :   " ;
 for(int i=0 ; i< n ; i++)
 {
       values += matt[i] ;

     if( i < n )
     {
         values += "  , ";
     }
 }
 JOptionPane.showMessageDialog(null , values);

 String values2 = " Your values in reverse form are :  ";
  for( int i = n-1 ; i >=0 ; i--)
  {
     values2 += matt[i] ;
    
    if ( i > 0 )
    {
        values2 += "  ,  " ;
        
    }
    
  }
  JOptionPane.showMessageDialog(null , values2 ) ;

  String value3 = "Maximum number is :";
  int max = matt[0] ;
  for( int i=0 ; i < n ; i++)
  {
      if( matt[i] > max)
      {max = matt[i] ;}
  }
   value3 += max ;

  JOptionPane.showMessageDialog(null , value3 ); 

  String value4 =" Minimum number  is  : " ;
  int min = matt[0] ; 
  for( int i =0 ; i > n ; i++)
  {
      if(matt[i] < min )
      { min =  matt[i];}
  }
   value4 += min ;
  JOptionPane.showMessageDialog( null , value4); 

  String value5 = " The sum of all the elements is : " ; 
  int total =0 ;
  for ( int i =0 ; i< n ; i++ )
  {
      total += matt[i] ;
  }
  value5 += total ; 
  JOptionPane.showMessageDialog(null, value5);

  Gui object =  new Gui();
 object.averagenumber = average( total , n );

   JOptionPane.showMessageDialog(null,"Average = " + object.averagenumber);
}
  
 public static double average(double a  , double b )
 {
    double average1= a/b;
    return average1 ;
 }


}