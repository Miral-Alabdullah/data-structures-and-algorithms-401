package HashTable;


import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public String repeatedWord(String text) throws Exception{
        if (text == null){
            throw new Exception("Empty Text!!");
        }
        String[] words = text.split(" ");
        String word= "";
        Map<String,String> wordMap = new HashMap<>();

        for (String s : words) {
            word = s.toLowerCase();
            if (wordMap.get(word) != null) {
                System.out.println("The First Repeated Word Is : " + word);
                break;
            } else {
                wordMap.put(word, word);
            }
        }
        return word;
    }
}
