public class Polygon {
    private Point[] vertices;

    private Style style;

    public Polygon (int value){
        vertices = new Point[value];
        style = new Style("transparent", "black", 1);
    }
    public Polygon (int value, Style style){
        vertices = new Point[value];
        this.style = style;
    }

    public Polygon (Point[] points){
        vertices = points;
        style = new Style("transparent", "black", 1);
    }
    public Polygon (Point[] points, Style style){
        vertices = points;
        this.style = style;
    }

    public void setVertice(int index, Point point){
        vertices[index] = point;
    }

    public void setVertices(Point[] vertices) {
        for(int i = 0; i < vertices.length; i++){
            this.vertices[i] = vertices[i];
        }
    }

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
