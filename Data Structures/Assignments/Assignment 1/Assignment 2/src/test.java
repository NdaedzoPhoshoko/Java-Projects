public class test
{
    public static void main(String[] args) {
        String ID = "1222333433445";
        long actual_ID;

        if(ID.length() != 13)
        {
            System.out.print("Not allowed");
        }else //when of course, its 13
        {
            actual_ID = Long.parseLong(ID);
            System.out.print("Allowed: "+ actual_ID);
        }


    }
}