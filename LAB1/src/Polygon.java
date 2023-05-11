public class Polygon extends Shape{
    private Point[] vertices;
    public Polygon (int value){
        super(new Style("transparent", "black", 1));
        vertices = new Point[value];
    }
    public Polygon (int value, Style style){
        super(style);
        vertices = new Point[value];
    }

    public Polygon (Point[] points){
        super(new Style("transparent", "black", 1));
        vertices = points;
    }
    public Polygon (Point[] points, Style style){
        super(style);
        vertices = points;
    }

    public void setVertice(int index, Point point){
        vertices[index] = point;
    }

    public void setVertices(Point[] vertices) {
        for(int i = 0; i < vertices.length; i++){
            this.vertices[i] = vertices[i];
        }
    }

    @Override
    public String toSvg(){
        String textVertices = "";
        for (Point vertex : vertices){
            textVertices+= vertex.x + ", " + vertex.y + " ";
        }
        textVertices = textVertices.substring(0, textVertices.length() - 1);
        return String.format("<polygon points=\"%s\" %s />\n", textVertices, style.toSvg());
    }

    public static Polygon square(Segment segment, Style style) {
        Point p1 = new Point(segment.getP1()), p2 = new Point(segment.getP2());
        return new Polygon(new Point[]{new Point(p1.x, p2.y), new Point(p2.x, p2.y), new Point(p2.x, p1.y), new Point(p1.x, p1.y)}, style);
    }
}
