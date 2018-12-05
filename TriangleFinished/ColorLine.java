package prj01;

public class ColorLine extends Line{
    private int color;
    public ColorLine(Point begin, Point end, int color) {
        super(begin, end);
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
        return "ColorLine{" +
                "color=" + color +
                ", " + super.toString();
    }
}
