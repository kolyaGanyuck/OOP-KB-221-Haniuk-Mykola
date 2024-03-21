package lab04;

public class Triangle extends Shape {

    private Point A, B, C;
    private int sideA, sideB, sideC;
    private double halfPerimeter;

    Triangle(Point A, Point B, Point C) {
        super(A, C);
        sideA = calculateCoordinate(A, B);
        sideB = calculateCoordinate(B, C);
        sideC = calculateCoordinate(C, A);
        System.out.println(sideA);
        System.out.println(sideB);
        System.out.println(sideC);
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
            this.C = C;
            System.out.println("Трикутник створений та може існувати");
            halfPerimeter = (double) (sideA + sideB + sideC) / 2;
        }
        else throw new IllegalArgumentException("Трикутник є виродженим");
    }


    @Override
    public double area() {
        double area = Math.sqrt(halfPerimeter
                * (halfPerimeter - sideA)
                * (halfPerimeter - sideB)
                * (halfPerimeter - sideC));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle[A(" + A.getX() + "," + A.getY() + ") B(" + B.getX() + "," + B.getY() + ") C(" + C.getX() + "," + C.getY() + ")]";
    }

    @Override
    public Point centroid() {
        int centerX = (A.getX() + B.getX() + C.getX()) / 3;
        int centerY = (A.getY() + B.getY() + C.getY()) / 3;
        return new Point(centerX, centerY);
    }
}
