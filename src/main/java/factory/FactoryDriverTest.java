package factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import builder.CarBuilder;
import builder.DriverBuilder;
import entity.Car;
import entity.Driver;
import entity.Level;

public class FactoryDriverTest {
    private FactoryDriver factoryDriver;

    private Driver driver;

    private Car car;

    @Before
    public void before() {
        this.factoryDriver = new FactoryDriver();
        this.car = new CarBuilder().id(1).model("Renault Megane").registration("Madrid").build();
        this.driver = new DriverBuilder().id(1).car(this.car).level(Level.EXPERT).phone(665129265).reference("AJGM").build();
        factoryDriver.almacenate(this.driver);
    }

    @SuppressWarnings("unused")
    @Test
    public void testAlmacenate() {
        assertTrue(factoryDriver.search(this.driver));
        try {
            this.driver = new DriverBuilder().id(1).car(this.car).build();
        } catch (UnsupportedOperationException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSearch() {
        assertTrue(factoryDriver.search(this.driver));
        Driver driver = new DriverBuilder().id(3).car(this.car).build();
        assertFalse(factoryDriver.search(driver));
    }

}
