package lab02.task2;

import lab02.task1.Point;

public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point line1, Point line2) {
        this.startPoint = line1;
        this.endPoint = line2;
    }

    public double lengthSegment() {
        return Math.sqrt(Math.pow((endPoint.getX() - startPoint.getX()), 2)
                + Math.pow((endPoint.getY() - startPoint.getY()), 2));
    }

    @Override
    public String toString() {
        return "{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    public Point middlePoint() {
        double x = (startPoint.getX() + endPoint.getX()) / 2.0;
        double y = (startPoint.getY() + endPoint.getY()) / 2.0;
        return new Point(x, y);
    }

    public Point intersection(Segment segment2) {
        double x1 = startPoint.getX();
        double y1 = startPoint.getY();
        double x2 = endPoint.getX();
        double y2 = endPoint.getY();
        double x3 = segment2.startPoint.getX();
        double y3 = segment2.startPoint.getY();
        double x4 = segment2.endPoint.getX();
        double y4 = segment2.endPoint.getY();

        // значення нахилів
        double m1 = (y2 - y1) / (x2 - x1);
        double m2 = (y4 - y3) / (x4 - x3);

        // значення зсувів
        double c1 = y1 - m1 * x1;
        double c2 = y3 - m2 * x3;

        // координати точки перетину
        double x = (c2 - c1) / (m1 - m2);
        double y = m1 * x + c1;
        return new Point(x,y);
    }

    public static void main(String[] args) {
        Segment segment1 = new Segment(new Point(0, 0), new Point(0, 5));
        Segment segment2 = new Segment(new Point(0, 3), new Point(0, 4));
        System.out.println("Тестові дані перший відрізок: " + segment1);
        System.out.println("Тестові дані другий відрізок: " + segment2);
        System.out.println("Довжина відрізка = " + segment1.lengthSegment());
        System.out.println("Середня точка відрізка = " + segment1.middlePoint());
        Point point5 = segment1.intersection(segment2);
        System.out.println("Точки перетину відрізків - x = " + point5.getX() + " y = " + point5.getY());

    }
}
