package patterns.composite.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import patterns.builder.CarBuilder;
import patterns.builder.DriverBuilder;
import patterns.composite.DriverComponent;
import patterns.composite.DriverComposite;
import patterns.composite.DriverLeaf;
import patterns.entity.Car;
import patterns.entity.Driver;
import patterns.entity.Level;

public class DriverComponentTest {
    private DriverComponent driverComponent1, driverComponent2, driverComponent3, driverComponent4, driverComponent5, driverComponent6;

    @Before
    public void before() {
        Car car1 = new CarBuilder().id(1).model("Renault Megane").registration("Madrid").build();
        Driver driver1 = new DriverBuilder().id(1).car(car1).level(Level.EXPERT).phone(665129265).reference("AJGM").build();
        Driver driver2 = new DriverBuilder().id(2).car(car1).phone(665129265).reference("FRGT").build();
        Driver driver3 = new DriverBuilder().id(3).car(car1).level(Level.NORMAL).phone(665129265).reference("AWRT").build();
        Driver driver4 = new DriverBuilder().id(4).car(car1).level(Level.EXPERT).reference("XXCE").build();
        this.driverComponent1 = new DriverLeaf(driver1);
        this.driverComponent4 = new DriverLeaf(driver4);
        this.driverComponent5 = new DriverComposite("Conductores Expertos");
        this.driverComponent5.addDriver(driverComponent1);
        this.driverComponent5.addDriver(driverComponent4);
        this.driverComponent2 = new DriverLeaf(driver2);
        this.driverComponent3 = new DriverLeaf(driver3);
        this.driverComponent6 = new DriverComposite("Conductores Principiantes");
        this.driverComponent6.addDriver(driverComponent2);
    }

    @Test
    public void testSizeLeaf() {
        assertEquals(0, this.driverComponent3.size());
    }

    @Test
    public void testSizeComposite() {
        assertEquals(2, this.driverComponent5.size());
    }

    @Test
    public void testAddDriverComposite() {
        assertEquals(1, this.driverComponent6.size());
        this.driverComponent6.addDriver(this.driverComponent3);
        assertEquals(2, this.driverComponent6.size());
    }

    @Test
    public void testDeleteDriverComposite() {
        assertEquals(1, this.driverComponent6.size());
        this.driverComponent6.deleteDriver(driverComponent2);
        assertEquals(0, this.driverComponent6.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddDriverLeaf() {
        this.driverComponent3.addDriver(this.driverComponent3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDeleteDriverLeaf() {
        this.driverComponent3.deleteDriver(driverComponent2);
    }

    @Test
    public void testViewComposite() {
        assertEquals("Conductores Expertos", this.driverComponent5.view());
    }

    @Test
    public void testViewLeaf() {
        assertEquals("3", this.driverComponent3.view());
    }

    @Test
    public void testIsCompositeLeaf() {
        assertFalse(this.driverComponent3.isComposite());
    }

    @Test
    public void testIsCompositeComposite() {
        assertTrue(this.driverComponent6.isComposite());
    }

}
