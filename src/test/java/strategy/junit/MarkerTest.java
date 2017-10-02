package strategy.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import strategy.BoldMarkerStrategy;
import strategy.ItalicMarkerStrategy;
import strategy.Marker;
import strategy.UnderlineMarkerStategy;

public class MarkerTest {
    private Marker marker1;

    private Marker marker2;

    private Marker marker3;

    @Before
    public void before() {
        this.marker1 = new Marker(new BoldMarkerStrategy());
        this.marker2 = new Marker(new ItalicMarkerStrategy());
        this.marker3 = new Marker(new UnderlineMarkerStategy());
    }

    @Test
    public void testDoMarkedBold() {
        assertEquals("<b>Alberto</b>", marker1.doMarked("Alberto"));
    }

    @Test
    public void testDoMarkedItalic() {
        assertEquals("<i>Alberto</i>", marker2.doMarked("Alberto"));
    }

    @Test
    public void testDoMarkedUnderline() {
        assertEquals("<u>Alberto</u>", marker3.doMarked("Alberto"));
    }

}
