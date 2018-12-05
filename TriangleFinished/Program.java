package prj01;

public class Program {

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        Point p1 = new Point(1, 1);
        System.out.println(p);
        System.out.println(p1);
        ColorPoint cp1 = new ColorPoint(2, 1, 313131);
        ColorPointAgr cp2 = new ColorPointAgr(p, 444444);
        System.out.println(cp1);
        System.out.println(cp2);
        Line l1 = new Line(p, p1);
        System.out.println(l1);
        Line l2 = new Line(6,6,7,7);
        System.out.println(l2);
        Line l3 = new Line(new Point(8,8), new Point(9,9));
        System.out.println(l3);
        Line l4 = new Line(l2.getBegin(), l3.getEnd());
        System.out.println(l4);
        ColorLine cl1 = new ColorLine(p, p1, 555333);
        System.out.println(cl1);
        /* ****************************************************** */
        Point a1 = new Point(1, 1);
        Point a2 = new Point(3, 4);
        Point a3 = new Point(5, 1);
        Triangle t1 = new Triangle(a1, a2, a3);
        System.out.println(t1);
        ColorTriangle ct1 = new ColorTriangle(a1, a2, a3, 535353);
        System.out.println(ct1);
    }
}