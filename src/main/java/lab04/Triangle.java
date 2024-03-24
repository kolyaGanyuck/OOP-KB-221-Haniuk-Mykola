package lab04;

public class Triangle implements Shape {

    private Point A, B, C;
    private int sideA, sideB, sideC;
    private double halfPerimeter;

    Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        calculateSides();
        if (isDegenerate()) {
            System.out.println("Трикутник успішно створений");
            halfPerimeter = (double) (sideA + sideB + sideC) / 2;
            System.out.println("Півпериметр " + halfPerimeter);
            System.out.println("Площа " + area());
            System.out.println("Центроїд " + centroid());
        } else throw new IllegalArgumentException("Трикутник є виродженим");
    }

    public void calculateSides() {
        sideA = calculateCoordinate(A, B);
        sideB = calculateCoordinate(B, C);
        sideC = calculateCoordinate(C, A);
    }

    public boolean isDegenerate(){
        return sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB;
    }

    @Override
    public double area() {
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - sideA)
                * (halfPerimeter - sideB)
                * (halfPerimeter - sideC));

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

    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 1);
        Point point3 = new Point(2, 2);
        Triangle triangle = new Triangle(point1, point2, point3);
        System.out.println(triangle);
    }
}
