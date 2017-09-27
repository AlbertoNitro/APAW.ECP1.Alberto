package builder;

import entity.Car;
import entity.Driver;
import entity.Level;

public class DriverBuilder {
    private Driver driver;

    public DriverBuilder(int id, Level level, Car car) {
        this.driver = new Driver(id, level, car);
    }

    public DriverBuilder phone(long phone) {
        this.driver.setPhone(phone);
        return this;
    }

    public DriverBuilder reference(long phone) {
        this.driver.setPhone(phone);
        return this;
    }

    public DriverBuilder level(Level level) {
        this.driver.setLevel(level);
        return this;
    }

    public DriverBuilder car(Car car) {
        this.driver.setCar(car);
        return this;
    }

    public Driver build() {
        return this.driver;
    }

}
