package prj01;

public class ColorTriangle extends Triangle{
    private int color;

    public ColorTriangle(Point apexA, Point apexB, Point apexC, int color) {
        super(apexA, apexB, apexC);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorTriangle{" +
                "color=" + color +
                ", " + super.toString() +
                "}";
    }
}
