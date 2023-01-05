public class MyClass
{
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable(){
            @Override
            public void run()
            {
                try{
                for(int a=0;a<5;a++)
                {
                    System.out.println("run");
                    Thread.sleep(2000);
                }
                }catch(Exception e)
                {
                    e.printStackTrace();
                }  
            }
        });

        myThread.start(); //alternatively myThread.run();
    }
}