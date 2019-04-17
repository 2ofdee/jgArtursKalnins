package lv.Homework9;

public class UniqueWordVocabularyTest {
    public static void main(String[] args) {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.addWord("dog");
        uniqueWordVocabulary.addWord("cat");
        uniqueWordVocabulary.addWord("hello world");
        uniqueWordVocabulary.getUniqueWords();
        uniqueWordVocabulary.printToConsole();

    }
}
