package hwKPI.lab5;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Letter> wordByLetters;

    public Word(String word) {
        this.word = word;
        this.wordByLetters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            wordByLetters.add(new Letter(word.charAt(i)));
        }
    }

    @Override
    public String toString() {
        return "Word{" + wordByLetters + '}';
    }
}
