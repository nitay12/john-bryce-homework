package nitay.ransomnote;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        boolean isMatch = true;
        //Converting the magazine list to Hashmap
        Map<String, Integer> magazineWordsMap = new HashMap<>();
        for (String magazineWord : magazine) {
            if (!magazineWordsMap.containsKey(magazineWord)) {
                magazineWordsMap.put(magazineWord, 1);
            } else {
                int val = magazineWordsMap.get(magazineWord);
                magazineWordsMap.put(magazineWord, val + 1);
            }
        }
        //Iterating over note's words and check if the magazine matches the note
        for (String noteWord : note) {
            if (magazineWordsMap.containsKey(noteWord)) {
                int val = magazineWordsMap.get(noteWord);
                if (magazineWordsMap.get(noteWord) > 0) {
                    magazineWordsMap.put(noteWord, val - 1);
                } else {
                    isMatch = false;
                    break;
                }
            } else {
                isMatch = false;
                break;
            }
        }
        if(isMatch){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        TestCase test1 = new TestCase("I am magazine i am magazine a big magazine", "I am not a magazine");
        TestCase test2 = new TestCase("I am magazine i am magazine a big magazine", "I am a magazine");
        checkMagazine(test1.magazine,test1.note);
        checkMagazine(test2.magazine,test2.note);
    }
}

