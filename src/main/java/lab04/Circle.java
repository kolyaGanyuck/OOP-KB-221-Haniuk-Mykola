package lab04;


public class Circle implements Shape {
    private Point A;
    private double r;

    Circle(Point A, double r) {
        this.r = r;
        if (isDegenerate()) {
            this.A = A;
            System.out.println("Коло успішно створено");
            System.out.println("Площа " + area());
            System.out.println("Центроїд " + centroid());
        } else throw new IllegalArgumentException("Радіус кола має бути більше 0");
    }

    public boolean isDegenerate() {
        return r > 0;
    }

    @Override
    public double area() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle(" + A.x + ", " + A.y + ")";
    }

    @Override
    public Point centroid() {
        return new Point(A.x, A.y);
    }

    public static void main(String[] args) {
        Point point = new Point(3, 4);
        Circle circle = new Circle(point, 6);
        System.out.println(circle);
    }
}
