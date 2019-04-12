package hwKPI.lab5;

import java.util.ArrayList;
import java.util.Iterator;

public class Text implements Iterable{
    private String text;
    private ArrayList<Sentence> textBySentences;
    private ArrayList<GetAble> textBySymbols;

    public Text(String text) {
        this.text = text;
        if (text.length() > 0) {
            this.textBySentences = new ArrayList<>();
            this.textBySymbols = new ArrayList<>();
            text = text.replace('\t', ' ');
            text = text.trim().replaceAll(" +", " ");
            String[] snts = text.split("(?<=[.!?])\\s");
            for (int i = 0; i < snts.length; i++) {
                this.textBySentences.add(new Sentence(snts[i]));
            }
            String[] lets = text.split("");
            for (int i = 0; i < lets.length; i++) {
                if (String.valueOf(lets[i].charAt(0)).matches("[,.!;:?]")){
                    this.textBySymbols.add(new Delimiter(lets[i].charAt(0)));
                }
                else{
                    this.textBySymbols.add(new Letter(lets[i].charAt(0)));
                }
            }
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<GetAble> getTextBySymbols() {
        return textBySymbols;
    }

    @Override
    public String toString() {
        return "Text{" + text + '}';
    }

    @Override
    public Iterator<Sentence> iterator() {
        return textBySentences.iterator();
    }
}