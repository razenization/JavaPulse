package hwKPI.lab5;

import java.util.ArrayList;

public class Sentence{
    private String sentence;
    private ArrayList<Object> sentenceTypes;

    public Sentence(String sentence) {
        this.sentence = sentence;
        this.sentenceTypes = new ArrayList<>();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (String.valueOf(words[i].charAt(words[i].length() - 1)).matches("[,.!?:;]")){
                Delimiter delim = new Delimiter(words[i].charAt(words[i].length() - 1));
                this.sentenceTypes.add(new Word(words[i].replace(String.valueOf(words[i].charAt(words[i].length() - 1)), "")));
                this.sentenceTypes.add(delim);
            }
            else{
                this.sentenceTypes.add(new Word(words[i]));
            }
        }
    }

    @Override
    public String toString() {
        return "Sentence{" + sentenceTypes + '}';
    }
}