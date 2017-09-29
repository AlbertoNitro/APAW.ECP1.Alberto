package factory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import entity.Driver;

public class FactoryDriver {
    private Map<Integer, Driver> factory;

    private static final FactoryDriver factoryDriver = new FactoryDriver();

    private FactoryDriver() {
        this.factory = new HashMap<Integer, Driver>();
    }

    public void almacenate(Driver driver) {
        Integer idDriver = new Integer(driver.getId());
        if (this.factory.get(idDriver) == null) {
            this.factory.put(idDriver, driver);
        } else {
            throw new UnsupportedOperationException("Conductor ya existente en la factoria con ese ID");
        }
    }

    public boolean search(Driver driver) {
        Integer idDriver = new Integer(driver.getId());
        boolean located = false;
        if (this.factory.get(idDriver) != null) {
            located = true;
        }
        return located;
    }
    
    public void clear() {
        this.factory.clear();
    }
    
    @SuppressWarnings("unused")
    public int size() {
        Collection<Driver> values = this.factory.values();
        int cont=0;
        for (Driver driver: values) {
            cont++;
        }
        return cont;
    }

    public static FactoryDriver getFactoryDriver() {
        return factoryDriver;
    }
}
