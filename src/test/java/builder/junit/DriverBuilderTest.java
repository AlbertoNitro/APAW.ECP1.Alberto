package builder.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import builder.DriverBuilder;
import entity.Car;
import entity.Driver;
import entity.Level;

public class DriverBuilderTest {
    private Car car;

    private Driver driver;

    @Before
    public void before() {
        this.car = new Car(1, "Madrid", "Renault Megane");
        this.driver = new DriverBuilder(1, Level.BEGINNER, car).build();
    }

    @Test
    public void testDriverBuilder() {
        assertEquals(Level.BEGINNER, driver.getLevel());
        assertEquals(1, driver.getId());
        assertEquals(car, driver.getCar());
        this.driver = new DriverBuilder(1, Level.BEGINNER, car).level(Level.EXPERT).phone(665129265).reference("AJGM").build();
        assertEquals(Level.EXPERT, driver.getLevel());
        assertEquals(665129265, driver.getPhone());
        assertEquals("AJGM", driver.getReference());
    }

    @Test
    public void testPhone() {
        this.driver = new DriverBuilder(1, Level.BEGINNER, car).level(Level.EXPERT).phone(665129265).reference("AJGM").build();
        assertEquals(665129265, driver.getPhone());
    }

    @Test
    public void testReference() {
        this.driver = new DriverBuilder(1, Level.BEGINNER, car).level(Level.EXPERT).phone(665129265).reference("AJGM").build();
        assertEquals("AJGM", driver.getReference());
    }

    @Test
    public void testLevel() {
        assertEquals(Level.BEGINNER, driver.getLevel());
    }

    @Test
    public void testCar() {
        assertEquals(car, driver.getCar());
    }

}
