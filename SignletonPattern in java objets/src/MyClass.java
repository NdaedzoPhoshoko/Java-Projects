/*
 *Singleton pattern - when an instance appears once in the entire application
                    - mostly used for databases
 We created a class named Database that will have a singleton instance
 No more instances can be made
*/
public class MyClass
{
   public static void main(String[] args) {
      Database myInstance = Database.getInstance("db_videos"); //only myInstance can be instantiated
      System.out.print(myInstance.toString());
   }
}