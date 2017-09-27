package builder;

import entity.Car;
import entity.Driver;
import entity.Level;

public class DriverBuilder {
    private Driver driver;

    public DriverBuilder(int id, Level level, Car car) { // Como la entidad que me ha tocado, tiene dos relaciones de agregacion decido que al crear el condcutor, es necesario que me pasen el nivel y el coche del conductor.
        this.driver = new Driver(id, level, car);
    }

    public DriverBuilder phone(long phone) {
        this.driver.setPhone(phone);
        return this;
    }

    public DriverBuilder reference(String reference) {
        this.driver.setReference(reference);
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
