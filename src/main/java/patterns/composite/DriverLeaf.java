package patterns.composite;

import patterns.entity.Driver;

public class DriverLeaf implements DriverComponent {

    private Driver driver;

    public DriverLeaf(Driver driver) {
        super();
        assert driver != null;
        this.driver = driver;
    }

    @Override
    public void addDriver(DriverComponent driverComponent) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public void deleteDriver(DriverComponent driverComponent) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public String view() {
        return this.driver.getId()+"";
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

}
