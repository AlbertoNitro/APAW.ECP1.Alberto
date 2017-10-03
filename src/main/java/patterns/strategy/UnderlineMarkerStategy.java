package patterns.strategy;

public class UnderlineMarkerStategy implements MarkerStrategy {

    @Override
    public String markerText(String input) {
        return "<u>" + input + "</u>";
    }
}
