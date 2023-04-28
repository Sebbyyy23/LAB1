import java.util.Locale;

public class Segment {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length(){
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    }

    public String toSvg(){
        return String.format("<line x1=\"%f\" y1=\"%f\" x2=\"%f\" y2=\"%f\" style=\"stroke:rgb(255,0,0);stroke-width:2\" />", p1.x, p1.y, p2.x, p2.y);
    }

}
//    Zdefiniuj klasę Segment reprezentującą odcinek, posiadającą dwa prywatne punkty klasy Point. Wygeneruj akcesory i mutatory klasy Segment.
//    Napisz publiczną metodę, która zwraca długość odcinka. W kolejnym kroku usuń mutatory i utwórz konstruktor ustawiający te pola na wartości swoich dwóch parametrów.