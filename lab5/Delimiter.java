package hwKPI.lab5;

public class Delimiter implements GetAble {
    private char delimiter;

    public Delimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String toString() {
        return "Delimiter{"  + delimiter + '}';
    }

    @Override
    public char getSymbol() {
        return this.delimiter;
    }
}
