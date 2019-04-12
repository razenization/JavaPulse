package hwKPI.lab5;

public class Letter implements GetAble{
    private char letter;
    private int letterCode;

    public Letter(char letter) {
        this.letter = letter;
        this.letterCode = (int) letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getLetterCode() {
        return letterCode;
    }

    public void setLetterCode(int letterCode) {
        this.letterCode = letterCode;
    }

    @Override
    public String toString() {
        return "Letter{" + letter + '}';
    }

    @Override
    public char getSymbol() {
        return this.letter;
    }
}
