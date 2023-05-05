public class Polygon {
    private Point[] vertices;

    public Polygon (int value){
        vertices = new Point[value];
    }

    public void setVertices(int index, Point point){
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
        return String.format("<polygon points=\"%s\" style=\"fill:lime;stroke:purple;stroke-width:1\" />\n", textVertices);
    }
}
