package lv.Homework9;

import java.util.ArrayList;
import java.util.List;

public class UniqueWordVocabulary {

    private List<String> words = new ArrayList<>();

    public void addWord(String newWord) {
        words.add(newWord);
    }

    public void getUniqueWords() {
        System.out.println(words.size());
    }

    public void printToConsole() {
        System.out.println(words);
    }


}
