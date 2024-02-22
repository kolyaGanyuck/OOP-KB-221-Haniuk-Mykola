package lab02.Task3;

import lab02.task1.Point;
import lombok.Data;

@Data
public class Triangle {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    private double lengthOfSideA;
    private double lengthOfSideB;
    private double lengthOfSideC;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }
    // довжини за координатами
    public double calculateLength(Point point1, Point point2) {
        double dx = point2.getX() - point1.getX();
        double dy = point2.getY() - point1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    // a + b> c, a + c> b, b + c> a, (a> 0, b> 0, c> 0),
    public void callCalculateLength() {
        lengthOfSideA = calculateLength(firstPoint, secondPoint);
        lengthOfSideB = calculateLength(secondPoint, thirdPoint);
        lengthOfSideC = calculateLength(thirdPoint, firstPoint);
    }

    // трикутник існує тоді і тільки тоді, коли сума будь-яких двох його сторін більше третьою сторони.
    public String checkTriangle() throws DegenerateTriangle {
        if (lengthOfSideA + lengthOfSideB > lengthOfSideC &&
                lengthOfSideA + lengthOfSideC > lengthOfSideB &&
                lengthOfSideC + lengthOfSideB > lengthOfSideA) return "Трикутник правильний та може існувати";
        throw new DegenerateTriangle();
    }

    // півмериметр = (a+b+c) / 2
    // площа за формулою Герона
    public String calculateArea() {
        double halfPerimeter = (lengthOfSideA + lengthOfSideB + lengthOfSideC) / 2;
        double area = Math.sqrt(halfPerimeter
                * (halfPerimeter - lengthOfSideA)
                * (halfPerimeter - lengthOfSideB)
                * (halfPerimeter - lengthOfSideC));
        return "Півмериметр = " + halfPerimeter + "\nПлоща = " + area;
    }

    public Point calculateCentroid() {
        double x = (firstPoint.getX() + secondPoint.getX() + thirdPoint.getX()) / 3;
        double y = (firstPoint.getY() + secondPoint.getY() + thirdPoint.getY()) / 3;
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Triangle (Тестові дані) {" +
                "firstPoint= " + firstPoint +
                ", secondPoint= " + secondPoint +
                ", thirdPoint= " + thirdPoint +
                '}';
    }

    public static void main(String[] args) throws DegenerateTriangle {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 0);
        Point point3 = new Point(1.5, 2.598);
        Triangle triangle = new Triangle(point1, point2, point3);
        System.out.println(triangle);
        triangle.callCalculateLength();
        System.out.println("Довжина сторони а = " + triangle.getLengthOfSideA());
        System.out.println("Довжина сторони b = " + triangle.getLengthOfSideB());
        System.out.println("Довжина сторони c = " + triangle.getLengthOfSideC());
        System.out.println(triangle.checkTriangle());
        System.out.println(triangle.calculateArea());
        System.out.println("Центроїд трикутника = " + triangle.calculateCentroid());
    }
}
