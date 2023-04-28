public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(8, 6), point2 = new Point(0, 0);
        Segment segment = new Segment(point1, point2);
        System.out.println(segment.length());
        System.out.println(segment.toSvg());
    }
}