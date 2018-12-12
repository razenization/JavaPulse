package hw02.quadeq;

import static java.lang.Math.sqrt;

public class QuadraticEquation {        // we assume that the equation is set to the form ax^2 + bx + c = 0
    private int coefA;                  // and that the coefficients are integer
    private int coefB;
    private int coefC;

    public QuadraticEquation(int coefA, int coefB, int coefC) {
        this.coefA = coefA;
        this.coefB = coefB;
        this.coefC = coefC;
    }

    public int getCoefA() {
        return coefA;
    }

    public void setCoefA(int coefA) {
        this.coefA = coefA;
    }

    public int getCoefB() {
        return coefB;
    }

    public void setCoefB(int coefB) {
        this.coefB = coefB;
    }

    public int getCoefC() {
        return coefC;
    }

    public void setCoefC(int coefC) {
        this.coefC = coefC;
    }

    public double[] roots() {
        double D = getCoefB()*getCoefB() - 4 * getCoefA() * getCoefC();
        if (D > 0) {
            if (getCoefA() == 0) {
                double[] roots = new double[1];
                roots[0] = (double)-getCoefC() / getCoefB();
                return roots;
            }
            else {
                double[] roots = new double[2];
                roots[0] = (sqrt(D) - getCoefB()) / (2 * getCoefA());
                roots[1] = (-sqrt(D) - getCoefB()) / (2 * getCoefA());
                return roots;
            }
        }
        else if (D == 0) {
            double[] roots = new double[1];
            roots[0] = (double)getCoefB() / (2 * getCoefA());
            return roots;
        }
        else return null;
    }

    public double extr() {
        return (double)-getCoefB() / (2 * getCoefA());
    }

    public double[][] intervals() {
        if (coefA != 0) {
            if (getCoefA() > 0)
                return new double[][]{{Double.NEGATIVE_INFINITY, extr()}, {extr(), Double.POSITIVE_INFINITY}};
            else
                return new double[][]{{extr(), Double.POSITIVE_INFINITY}, {Double.NEGATIVE_INFINITY, extr()}};
        }
        else {
            if (coefB > 0) {
                return new double[][]{{0,0}, {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY}};
            }
            else
                return new double[][]{{Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY}, {0,0}};
        }
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" + coefA + "x^2" + coefB + "x" + coefC + "=0" + '}';
    }

    /*// beta +-
    @Override
    public String toString() {
        if (abs(coefA) > 1) {
            if (coefA > 1) {
                return String.format("%s%dx^2%+dx%+d=0%s", "QuadraticEquation{", coefA, coefB, coefC, '}');
            }
            else {
                return String.format("%s%+dx^2%+dx%+d=0%s", "QuadraticEquation{", coefA, coefB, coefC, '}');
            }
        }
        else if (abs(coefA) == 1){
            if (coefA == 1) {
                return String.format("%sx^2%+dx%+d=0%s", "QuadraticEquation{", coefB, coefC, '}');
                if (abs(coefB) == 1) {
                    return String.format("%sx^2+x%+d=0%s", "QuadraticEquation{", coefC, '}');
                }
            }
            else {
                return String.format("%s-x^2%+dx%+d=0%s", "QuadraticEquation{", coefB, coefC, '}');
            }
        }
    }*/
}
