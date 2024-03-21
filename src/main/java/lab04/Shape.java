package lab04;

public abstract class Shape {
    protected double a, b;
    protected Point A, B;

    Shape(Point A, Point B) {
        this.a = a;
        this.b = b;
    }
    Shape(){}

    public abstract double area();

    public abstract String toString();
    public abstract Point centroid();
    public int calculateCoordinate(Point A, Point B){
        return (int) Math.sqrt((B.x - A.y)*2 + (B.y - A.y) * 2);
    }
}
