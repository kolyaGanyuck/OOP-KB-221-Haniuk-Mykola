package lab04;

public class Quadrangle implements Shape {
    private Point A, B, C, D;
    private int sideA, sideB, sideC, sideD;
    private double firstDiagonal;
    private double secondDiagonal;
    private double halfPerimeter;

    Quadrangle(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        calculateSides();
        if (isDegenerate()) {
            System.out.println("Чотирикутник успішно створений");
            calculateDiagonals();
            halfPerimeter = (double) (sideA + sideB + sideC + sideD) / 2;
            System.out.println("Півпериметр " + halfPerimeter);
            System.out.println("Діагональ АС " + firstDiagonal);
            System.out.println("Діагональ BD " + secondDiagonal);
            System.out.println("Площа " + area());
            System.out.println("Центроїд " + centroid());
        } else throw new IllegalArgumentException("Чотирикутник є виродженим");
    }

    public void calculateSides() {
        sideA = calculateCoordinate(A, B);
        sideB = calculateCoordinate(B, C);
        sideC = calculateCoordinate(C, D);
        sideD = calculateCoordinate(D, A);
    }

    public void calculateDiagonals() {
        firstDiagonal = calculateCoordinate(A, C);
        secondDiagonal = calculateCoordinate(B, D);
    }

    public boolean isDegenerate() {
        boolean condition1 = (sideA + sideB + sideC > sideD);
        boolean condition2 = (sideA + sideB + sideD > sideC);
        boolean condition3 = (sideA + sideC + sideD > sideB);
        boolean condition4 = (sideB + sideC + sideD > sideA);

        return condition1 && condition2 && condition3 && condition4;
    }

    @Override
    public double area() {
        return Math.sqrt((halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC) * (halfPerimeter - sideD));
    }

    @Override
    public Point centroid() {
        int x = (A.x + B.x + C.x + D.x) / 4;
        int y = (A.y + B.y + C.y + D.y) / 4;
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Quadrangle[" +
                "A(" + A.getX() + "," + A.getY() + ") " +
                "B(" + B.getX() + "," + B.getY() + ") " +
                "C(" + C.getX() + "," + C.getY() + ") " +
                "D(" + D.getX() + "," + D.getY() + ")" +
                "]";
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(4, 0);
        Point point3 = new Point(3, 3);
        Point point4 = new Point(1, 4);
        Quadrangle quadrangle = new Quadrangle(point1, point2, point3, point4);
        System.out.println(quadrangle);
    }

}

