/*Topic 1: Concurrency/Threads
 * Concurrency - Running tasks or processes at the same time
 * Thread - Class for tasks that can be run simultaneously.
 *        - They can have priorities
 * Runnable - Interface that is used when we want to excecute threads
 *          - Use this interface for overriding method run()
 * Note: invoking method start() in a thread calls method run()
*/
/*
public class MyClass
{
    public static void main(String[] args){
        Thread myThread = new Thread(
            new Runnable() {
               @Override
               public void run()
               {
                  for(int a=0; a<5; a++)
                  {
                    System.out.println("Thread running. "+ (a+1));
                    try{ //try/ctach covered in topic 2
                         Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                  }
               }
            }
        );
        myThread.start();
        for(int b=0; b<5; b++)
            {
               System.out.println("Loop runing. "+ (b+1));
               try{ //try/ctach covered in topic 2
                Thread.sleep(1000);
                }catch(InterruptedException e){
               e.printStackTrace();
            }
            }
    }
}
//Alternatively use:
/*Runnable runnable = new Runnable() { //overriding method run()
        @Override
        public void run() //changed to show that thread is running
        {
            System.out.println("Another thread started");
        }
    };
    Thread thread = new Thread(runnable); //thread uses method run() in runnable
    thread.start();*/
//............................................
/*Topic 2: Exceptions
 * Exception is a parent class of exceptions that can are used for error handling
 * Use try{...}
       catch(exception e){...}
 *
 */

 public class MyClass
 {
    public static void main(String[] args) {
        int a=0, b=2;
        try
        {
            System.out.println(b/a);
        }catch(ArithmeticException e)
        {
            //System.out.print("error: devision by zero");
            System.out.print(e.getMessage());
        }
     /*try{
        if(a==0)
        {
            throw new ArithmeticException();
        }}catch(ArithmeticException e)
        {
            System.out.println("no devision by zero");
        }*/
    }
 }
 /*
   String name = null;
   try
   {
    name.equals("Ndaedzo");
   }catch(NullPointerException e)
   {
      e.getMessage();
   }
  */