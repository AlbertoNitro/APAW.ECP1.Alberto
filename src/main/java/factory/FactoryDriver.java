package factory;

import java.util.HashMap;
import java.util.Map;

import entity.Driver;

public class FactoryDriver {
    private Map<Integer, Driver> factory;
    
    public FactoryDriver() {
        this.factory = new HashMap<Integer, Driver>();
    }
    
    public void almacenate(Driver driver) {
        Integer idDriver = new Integer(driver.getId());
        if (this.factory.get(idDriver)==null) {
            this.factory.put(idDriver, driver);
        } else {
            throw new UnsupportedOperationException("Conductor ya existente en la factoria con ese ID");
        }
    }
    
    public boolean search(Driver driver) {
        Integer idDriver = new Integer(driver.getId());
        boolean located = false;
        if (this.factory.get(idDriver)!=null) {
            located = true;
        }
        return located;
    }
}
