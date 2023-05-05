public class Main {
    public static void main(String[] args) {

        Point
                point1 = new Point(8, 6),
                point2 = new Point(0, 0),
                point3 = new Point(3, 5);

        Segment segment = new Segment(point1, point2);;
        Segment[] perpendicularSegements = Segment.perpendicular(segment, point3);

        System.out.println(segment.toSvg());
        System.out.println(perpendicularSegements[0].toSvg());
    }


}