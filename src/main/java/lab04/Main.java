package lab04;



public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(4, 1);
        Point point3 = new Point( 2,  4);
        Triangle triangle = new Triangle(point1, point2, point3);
        System.out.println( triangle.area());
    }
}
