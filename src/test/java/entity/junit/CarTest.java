package entity.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entity.Car;

public class CarTest {
    private Car car;

    @Before
    public void before() {
        this.car = new Car(1, "Madrid", "Renault Megane");
    }

    @Test
    public void testCar() {
        assertEquals(1, this.car.getId());
        assertEquals("Madrid", this.car.getRegistration());
        assertEquals("Renault Megane", this.car.getModel());
    }

    @Test
    public void testGetModel() {
        assertEquals("Renault Megane", this.car.getModel());
    }

    @Test
    public void testGetId() {
        assertEquals(1, this.car.getId());
    }

    @Test
    public void testGetRegistration() {
        assertEquals("Madrid", this.car.getRegistration());
    }

}
