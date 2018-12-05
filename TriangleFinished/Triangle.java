package prj01;

public class Triangle extends Figure{
    private Point apexA;
    private Point apexB;
    private Point apexC;

    private Line sideAB;
    private Line sideBC;
    private Line sideAC;

    public Triangle(Point apexA, Point apexB, Point apexC) {
        this.apexA = apexA;
        this.apexB = apexB;
        this.apexC = apexC;
        //sideAB = new Line(apexA, apexB);
        //sideBC = new Line(apexB, apexC);
        //sideAC = new Line(apexA, apexC);
    }

    public Line getSideAB() {
        if (sideAB == null) sideAB = new Line(apexA, apexB);            // отложенная (ленивая) инициализация
        return sideAB;
    }

    public Line getSideBC() {
        if (sideBC == null) sideBC = new Line(apexB, apexC);            // отложенная (ленивая) инициализация
        return sideBC;
    }

    public Line getSideAC() {
        if (sideAC == null) sideAC = new Line(apexA, apexC);            // отложенная (ленивая) инициализация
        return sideAC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideAB=" + getSideAB() +
                ", sideBC=" + getSideBC() +
                ", sideAC=" + getSideAC() +
                "}";
    }
}
