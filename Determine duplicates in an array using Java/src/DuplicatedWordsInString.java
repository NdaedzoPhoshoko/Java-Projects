//find all words that are duplicated in the sentence excluding special characters

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatedWordsInString {

    public static void main(String[] args) {
        String sentence = "Hey There Life is Beautiful But Hey it might be Amazing out There.!";
        String words[] = sentence.split("[ !.]");
        List<String> mWords = new ArrayList<>();
        
        int s=0;
        while(s<words.length) //copy all words from sentence to arrayList
        {
            mWords.add(words[s]);
            s++;
        }

        Map<String, Integer> duplicates = new HashMap<>(); //map to store duplicated word and count

        while(mWords.size()>0)
        {
            String currentWord = mWords.get(0); //current word to check for duplicates
            Boolean run = true;
            int count =0; //to store the occurances for each word

            while(run)
            {
                if(mWords.contains(currentWord))//assuming list has a word count number of times it occurs
                {
                    count++;
                    mWords.remove(currentWord); //remove this occurance to avoid reading it multiple times
                }else{//assuming the word has no other duplicates then stop loop
                    run = false;
                    if(count>1)//assuming word has multiple occurances, store it in the duplicates with the count value
                    {
                        duplicates.put(currentWord, count);
                    }
                }
            }
        }
        //display the duplicates and occurances
        System.out.print("\tShowing Duplicates and the occurances\n");
        for(String eachWord: duplicates.keySet())
        {
            System.out.println(eachWord+ " : "+ duplicates.get(eachWord));
        }
    }
}
