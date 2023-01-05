/*
Authors : Ndae.. Ph, Dit.., Mash..., Ntha..., Kea..., Una...
Date    : 21 April 22
Project : How to implement an interface
*/

interface ourNames  //collection of methods that do not have definitions
{
    public void studentName();
    public void fakeNames(); //two methods without a body
}

class justATester implements ourNames
{
    public void studentName()
    {
        System.out.println("Greetings");
    }
    public void fakeNames()
    {
        System.out.println("Goodbye");

    }
}

class collector implements ourNames  //here collector inherits the method of ourNames
{
    collector() //constructor that displays title
    {
        String title = "We are implementing now";
        System.out.println(title.toUpperCase());
    }
    @Override
    public void studentName()
    {
        System.out.println("Student Names: Ndae.. Ph, Dit.., Mash..., Ntha..., Kea..., Una...");
    }

    @Override  //change the body of a method within another class or interface
    public void fakeNames()
    {
        System.out.println("Fake Names: Ndae.. Ph, Dit.., Mash..., Ntha..., Kea..., Una...");
    }

}

public class myClass
{
    public static void main(String[] args)
    {  //drive here
        collector myObject = new collector();
        myObject.fakeNames();
        myObject.studentName();

        justATester myObject1 = new justATester();
        myObject1.studentName();
        myObject1.fakeNames();
        
    }
}
