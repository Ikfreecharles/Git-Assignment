import java.util.ArrayList;

public class LongestWord {
    public static void main(String[] args) {

    }
    public static String longestWord(ArrayList<String> words){
        String myLongestWord = "";
        int iniWordLength = 0;
        for (int i = 0; i < words.size(); i++){
            String eachWord = words.get(i);
            if (eachWord.length() > iniWordLength){
                iniWordLength = eachWord.length();
                myLongestWord = eachWord;
            }
        }
        return myLongestWord;
    }
}
