public class Point {
    public final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
