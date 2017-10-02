package patterns.strategy;

public class Marker {

    private MarkerStrategy markerStrategy;

    public Marker(MarkerStrategy markerStrategy) {
        this.markerStrategy = markerStrategy;
    }

    public String doMarked(String input) {
        return this.markerStrategy.markerText(input);
    }

}
