package hw02.quadeq;

public class QuadProg {
    public static void main(String[] args) {
        QuadraticEquationList equations = new QuadraticEquationList();
        equations.add(new QuadraticEquation(4, 3, 8));
        equations.add(new QuadraticEquation(1, -1, -2));
        equations.add(new QuadraticEquation(1, 4, 4));
        equations.add(new QuadraticEquation(8, -48, 4));
        System.out.println(equations.get(1));
        double[] rootsOfSecond = equations.get(1).roots();
        double[][] intervalsOfFourth = equations.get(3).intervals();
        System.out.printf("Falls at : (%f ; %f)%n", intervalsOfFourth[0][0], intervalsOfFourth[0][1]);
        System.out.printf("Grows at : (%f ; %f)%n", intervalsOfFourth[1][0], intervalsOfFourth[1][1]);
    }
}
