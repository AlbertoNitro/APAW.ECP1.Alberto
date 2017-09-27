package entity.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entity.Car;
import entity.Driver;
import entity.Level;

public class DriverTest {
    private Driver driver;

    private Car car;

    @Before
    public void before() {
        this.car = new Car(1, "Madrid", "Renault Megane");
        this.driver = new Driver(1, "AJGM", 665129265, Level.EXPERT, this.car);
    }

    @Test
    public void testDriver() {
        assertEquals(1, this.driver.getId());
        assertEquals("AJGM", this.driver.getReference());
        assertEquals(665129265, this.driver.getPhone());
        assertEquals(Level.EXPERT, this.driver.getLevel());
        assertEquals(this.car, this.driver.getCar());
    }

    @Test
    public void testGetId() {
        assertEquals(1, this.driver.getId());
    }

    @Test
    public void testGetReference() {
        assertEquals("AJGM", this.driver.getReference());
    }

    @Test
    public void testGetPhone() {
        assertEquals(665129265, this.driver.getPhone());
    }

    @Test
    public void testGetLevel() {
        assertEquals(Level.EXPERT, this.driver.getLevel());
    }

    @Test
    public void testGetCar() {
        assertEquals(this.car, this.driver.getCar());
    }

}
