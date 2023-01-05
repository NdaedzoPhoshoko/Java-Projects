public class forComparing {
    public static void main(String[] args) {
        //drive here
        weCompare myObject = new weCompare(); //instantiate the class weCompare
        int result = myObject.compare(13, 23);

        if(result == -1)
        {
            System.out.print("Results: e1 < e2");
        }else if(result == 1)
        {
            System.out.print("Results: e1 > e2");
        }else
          {
              System.out.print("Results: e1 == e2");
          }
    }
}
