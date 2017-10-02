package patterns.strategy;

public class UnderlineMarkerStategy extends MarkerStrategy {

    public String markerText(String input) {
        return "<u>" + input + "</u>";
    }
}
