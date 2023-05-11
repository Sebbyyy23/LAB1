public class Ellipse extends Shape {

    private Point center;
    private double radiusX, radiusY;

    public Ellipse(Point point, double radiusX, double radiusY, Style style) {
        super(style);
        this.center = point;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    public String toSvg() {
        return String.format("<ellipse cx=\"%f\" cy=\"%f\" rx=\"%f\" ry=\"%f\" %s />", center.x, center.y, radiusX, radiusY, style.toSvg());
    }
}
