import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SvgScene {
    private List<Polygon> polygons = new ArrayList<>();
    public void add(Polygon polygon){
        polygons.add(polygon);
    }
    public void saveHtml(String path){
        try {
            FileWriter fw = new FileWriter(path);
            fw.write("<html> <body> <svg width=\"1000\" height=\"1000\">\n");
            for(var polygon : polygons){
                fw.write(polygon.toSvg()+"\n");
            }
            fw.write("</svg>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>");
//            for(int i =0;i<shapes.size();++i){
//                shapes.get(i);
//            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}