package patterns.strategy;

public class ItalicMarkerStrategy implements MarkerStrategy {

    @Override
    public String markerText(String input) {
        return "<i>" + input + "</i>";
    }

}
