package lab04;

import lombok.Data;

@Data
public class Point {

    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }

    protected int x, y;

    Point (int x, int y){
        this.x = x;
        this.y = y;
    }
}
