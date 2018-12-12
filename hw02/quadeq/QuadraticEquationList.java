package hw02.quadeq;

import java.util.Arrays;

public class QuadraticEquationList {

    private QuadraticEquation[] equations;
    private int counter;

    public QuadraticEquationList() {
        equations = new QuadraticEquation[3];
        counter = -1;
    }

    public void add(QuadraticEquation equation) {
        if (counter == equations.length - 1) {
            equations = Arrays.copyOf(equations, equations.length * 2);
        }
        equations[++counter] = equation;
    }

    public QuadraticEquation get(int i) {
        if (i < size())
            return equations[i];
        else return null;
    }

    public int size() {
        return counter + 1;
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.println(equations[i]);
        }
    }

    public void update(int i, QuadraticEquation equation) {
        if (i < size())
            equations[i] = equation;
    }

    @Override
    public String toString() {
        String out = "";
        for (QuadraticEquation equation : equations) {
            if (equation != null)
                if (out.equals(""))
                    out = out + equation;
                else out = out + ", " + equation;
        }
        return out;
    }
}