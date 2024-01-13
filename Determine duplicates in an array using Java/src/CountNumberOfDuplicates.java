/*
Problem: Count the number of occurances of a certain String in an array
Psuedocode
1) int count; String currentStr
2) loop into array according to length of array
3) for each iteration: store the value at array[i] into currentStr
4) run a loop into all values of array checking
    if(array[i].equals(currentStr)
    { count++;}
5) then print the number of occurances
*/

import java.util.Scanner;

public class CountNumberOfDuplicates {
    public static void main(String[] args) {
        String[] words = {"Light", "Food", "Mike", "Banana", "Cake", "Apple", "Chair", "Life", "Bike", "Bus",
        "Apple", "Nike", "Laptop", "Human", "Bike", "Apple", "Sky", "Alive", "Love", "Peace", "Ram", "Google", "Again",
        "Once"};

        int count = 0;
        Scanner myInput = new Scanner(System.in);
        System.out.print("Type word to count: ");
        String wordToCount = myInput.nextLine();

        for(int i=0; i<words.length; i++)
        {
            if(words[i].equals(wordToCount))
            {
                count++;
            }
        }

        if(count!=0)
        {
            System.out.print(wordToCount+ " occured "+ count + " times.");
        }else if(count==1){
            System.out.print(wordToCount + " has no duplicates.");
        }else{
            System.out.print(wordToCount + " is not having a match");
        };

        myInput.close();
    }
}
