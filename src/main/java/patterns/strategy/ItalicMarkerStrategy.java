package patterns.strategy;

public class ItalicMarkerStrategy extends MarkerStrategy {

    @Override
    public String markerText(String input) {
        return "<i>" + input + "</i>";
    }

}
