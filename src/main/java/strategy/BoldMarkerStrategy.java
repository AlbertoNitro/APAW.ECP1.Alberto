package strategy;

public class BoldMarkerStrategy extends MarkerStrategy {

    @Override
    public String markerText(String input) {
        return "<b>" + input + "</b>";
    }

}
