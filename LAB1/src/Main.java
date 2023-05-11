import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Point
                //TRIANGLE
                point1 = new Point(200, 10),
                point2 = new Point(250, 190),
                point3 = new Point(160, 210),
                //RECTANGLE
                point4 = new Point(300, 200),
                point5 = new Point(300, 100),
                point6 = new Point(600, 100),
                point7 = new Point(600, 200),
                //PENTAGON
                point8 = new Point(800, 200),
                point9 = new Point(900, 300),
                point10 = new Point(850, 400),
                point11 = new Point(750, 400),
                point12 = new Point(700, 300),
                //LINE
                point13 = new Point(600, 500),
                point14 = new Point(780, 600);

        Segment segment = new Segment(point1, point2);;
        Segment[] perpendicularSegements = Segment.perpendicular(segment, point3);

        //System.out.println(segment.toSvg());
        //System.out.println(perpendicularSegements[0].toSvg());

        Polygon polygon = new Polygon(3, new Style("yellow", "black", 2));
        polygon.setVertices(new Point[]{point1, point2, point3});
        //System.out.println(polygon.toSvg());

        Ellipse ellipse = new Ellipse(new Point(200, 300), 20, 50, new Style("lightblue", "blue", 3));
        System.out.println(ellipse.toSvg());
//        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
//        polygons.add(new Polygon(new Point[]{point1, point2, point3}));
//        polygons.add(new Polygon(new Point[]{point4, point5, point6, point7}));
//        polygons.add(new Polygon(new Point[]{point8, point9, point10, point11, point12}));

        SvgScene svgScene = new SvgScene();
        svgScene.add(new Polygon(new Point[]{point1, point2, point3}, new Style("yellow", "red", 4)));
        svgScene.add(new Polygon(new Point[]{point4, point5, point6, point7}, new Style("yellow", "red", 4)));
        svgScene.add(new Polygon(new Point[]{point8, point9, point10, point11, point12}, new Style("yellow", "red", 4)));
        svgScene.add(Polygon.square(new Segment(point13, point14), new Style("purple", "lime", 3)));
        svgScene.add(new Ellipse(new Point(200, 300), 100, 50, new Style("lightblue", "blue", 3)));
        svgScene.saveHtml("index.html");
    }

}