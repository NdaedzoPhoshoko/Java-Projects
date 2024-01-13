/*
Problem: Determine whether the array of words contains a duplicate
Psuedocode
1)bool isDup; String currentStr
2) loop into array according to length of array
3) for each iteration: store the value at array[i] into currentStr
4) run a nested loop into all values of array checking
    if(array[i].equals(currentStr)
    { isDup = true;
       halt the loops; }
5) then if(isDup)
        { print contains duplicates};
*/public class CheckForDuplicates {
    public static void main(String[] args) {
        String[] words = {"Light", "Food", "Mike", "Banana", "Cake", "Apple", "Chair", "Life", "Bike", "Bus",
        "Apple", "Nike", "Laptop", "Human", "Bike", "Apple", "Sky", "Alive", "Love", "Peace", "Ram", "Google", "Again",
        "Once"};

        boolean isDup = false;
        String currentStr = "";
        int i=0;
        while( (i<words.length) && isDup==false)
        {
            currentStr = words[i];
            int j=0;
            while( (j<words.length) && isDup==false)
            {
                if( i!=j && words[j].equals(currentStr)) //avoiding reading same value twice
                {
                    isDup = true;
                }
                j++;
            }
            i++;
        }
        String isFound = isDup ? "Duplicate found, word is "+ currentStr : "Duplicate not found";
        System.out.println(isFound);
    }
}
