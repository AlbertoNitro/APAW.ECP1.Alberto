package patterns.factory;

import java.util.HashMap;
import java.util.Map;

import patterns.entity.Driver;

public class FactoryDriver {
    private Map<Integer, Driver> factory;

    private static final FactoryDriver FACTORYDRIVER = new FactoryDriver();

    private FactoryDriver() {
        this.factory = new HashMap<>();
    }

    public void almacenate(Driver driver) {
        Integer idDriver = Integer.valueOf((driver.getId()));
        if (this.factory.get(idDriver) == null) {
            this.factory.put(idDriver, driver);
        } else {
            throw new UnsupportedOperationException("Conductor ya existente en la factoria con ese ID");
        }
    }

    public boolean search(Driver driver) {
        Integer idDriver = Integer.valueOf((driver.getId()));
        boolean located = false;
        if (this.factory.get(idDriver) != null) {
            located = true;
        }
        return located;
    }

    public void clear() {
        this.factory.clear();
    }

    public int size() {
        return factory.size();
    }

    public static FactoryDriver getFactoryDriver() {
        return FACTORYDRIVER;
    }
}
