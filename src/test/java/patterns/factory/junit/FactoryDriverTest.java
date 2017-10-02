package patterns.factory.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import patterns.builder.CarBuilder;
import patterns.builder.DriverBuilder;
import patterns.entity.Car;
import patterns.entity.Driver;
import patterns.entity.Level;
import patterns.factory.FactoryDriver;

public class FactoryDriverTest {
    private FactoryDriver factoryDriver;

    private Driver driver;

    private Car car;

    @Before
    public void before() {
        this.factoryDriver = FactoryDriver.getFactoryDriver();
        this.car = new CarBuilder().id(1).model("Renault Megane").registration("Madrid").build();
        this.driver = new DriverBuilder().id(1).car(this.car).level(Level.EXPERT).phone(665129265).reference("AJGM").build();
        this.factoryDriver.clear();
        factoryDriver.almacenate(this.driver);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAlmacenate() {
        assertTrue(factoryDriver.search(this.driver));
        factoryDriver.almacenate(this.driver);
    }

    @Test
    public void testSearch() {
        assertTrue(factoryDriver.search(this.driver));
        Driver driver = new DriverBuilder().id(3).car(this.car).build();
        assertFalse(factoryDriver.search(driver));
    }

    @Test
    public void testSize() {
        assertEquals(1, this.factoryDriver.size());
    }

    @Test
    public void testClear() {
        assertEquals(1, this.factoryDriver.size());
        this.factoryDriver.clear();
        assertEquals(0, this.factoryDriver.size());
    }

}
