package lab04;

public interface Shape {

    double area();

    String toString();

    Point centroid();

    boolean isDegenerate();

    default int calculateCoordinate(Point A, Point B) {
        return (int) Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));

    }

}
