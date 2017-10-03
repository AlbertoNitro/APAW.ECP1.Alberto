package patterns.strategy;

public class BoldMarkerStrategy implements MarkerStrategy {

    @Override
    public String markerText(String input) {
        return "<b>" + input + "</b>";
    }

}
