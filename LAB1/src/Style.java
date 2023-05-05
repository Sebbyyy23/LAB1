public class Style {
    private final String fillColor, strokeColor;
    private final double strokeWidth;

    public Style(String fillColor, String strokeColor, double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSvg(){
        return String.format("style=\"fill:%s;stroke:%s;stroke-width:%f\"", fillColor, strokeColor, strokeWidth);
    }
}
