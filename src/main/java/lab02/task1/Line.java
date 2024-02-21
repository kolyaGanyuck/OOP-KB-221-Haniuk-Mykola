package lab02.task1;

public class Line {
    private double a;
    private double b;
    public Line(double k, double b) {
        this.a = k;
        this.b = b;
    }
    public Point intersection(Line otherLine) {
        if (this.a == otherLine.a && this.b != otherLine.b) {
            return null;
        }
        if (this.a == otherLine.a && this.b == otherLine.b) {
            return null;
        }

        double x = (otherLine.b - this.b) / (this.a - otherLine.a);
        double y = this.a * x + this.b;
        return new Point(x, y);
    }
    public static void main(String[] args) {
        Line line1 = new Line(2, 3);
        Line line2 = new Line(3, 1);
        System.out.println("Тестові дані line1: a = " + line1.a + " b = " + line1.b);
        System.out.println("Тестові дані line2: a = " + line2.a + " b = " + line2.b);

        Point intersectionPoint = line1.intersection(line2);
        if (intersectionPoint != null) {
            System.out.println("Точка перетину: " + intersectionPoint);
        } else {
            System.out.println("Прямі збігаються або паралельні, немає точки перетину.");
        }
    }
}

