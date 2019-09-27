import java.util.HashMap;

public class WordCount {
    public HashMap<String, Integer> Count(String inputText) {
        //Declare a HashMap
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        //Split the string and place in an array
        String wordsArray[] = inputText.split("\\W+");
        //For Each word in the Array count how many times it appears in the string
        for (int i=0;i<wordsArray.length;i++){
         String stringWord = wordsArray[i];
            //Count the number of times the word appears
            int counter = 0;
            for (int a=0;a<wordsArray.length;a++){
             if (wordsArray[a].equals(stringWord)){
                 // Add to a counter
                 counter = counter + 1;
                 //add the word and count to the hashmap
                 map.put(stringWord, counter);
                }
            }
        }
        //Return the HashMap
        return map;
    }
}
