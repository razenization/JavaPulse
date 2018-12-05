package prj01;

public class ColorPoint  extends Point{
    private int color;

    public ColorPoint(int x, int y, int color) {
        super(x, y);
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
        return "ColorPoint{" +
                super.toString() +
                ", color=" + color +
                '}';
    }
}
