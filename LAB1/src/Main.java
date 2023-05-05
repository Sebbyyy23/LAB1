import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Point
                //TRIANGLE
                point1 = new Point(1, 1),
                point2 = new Point(30, 10),
                point3 = new Point(200, 300),
                //RECTANGLE
                point4 = new Point(300, 50),
                point5 = new Point(700, 50),
                point6 = new Point(300, 80),
                point7 = new Point(700, 80),
                //PENTAGON
                point8 = new Point(-5, -4),
                point9 = new Point(-1, -4),
                point10 = new Point(0, -2),
                point11 = new Point(-2, 0),
                point12 = new Point(-6, -2);

        Segment segment = new Segment(point1, point2);;
        Segment[] perpendicularSegements = Segment.perpendicular(segment, point3);

        //System.out.println(segment.toSvg());
        //System.out.println(perpendicularSegements[0].toSvg());

        Polygon polygon = new Polygon(3, new Style("yellow", "black", 2));
        polygon.setVertices(new Point[]{point1, point2, point3});
        //System.out.println(polygon.toSvg());

//        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
//        polygons.add(new Polygon(new Point[]{point1, point2, point3}));
//        polygons.add(new Polygon(new Point[]{point4, point5, point6, point7}));
//        polygons.add(new Polygon(new Point[]{point8, point9, point10, point11, point12}));

        SvgScene svgScene = new SvgScene();
        svgScene.add(new Polygon(new Point[]{point1, point2, point3}));
        svgScene.add(new Polygon(new Point[]{point4, point5, point6, point7}));
        svgScene.add(new Polygon(new Point[]{point8, point9, point10, point11, point12}));

        svgScene.saveHtml("index.html");
    }

}