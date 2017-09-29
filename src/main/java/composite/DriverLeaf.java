package composite;

import entity.Driver;

public class DriverLeaf extends DriverComponent {

    private Driver driver;

    public DriverLeaf(Driver driver) {
        super();
        assert driver != null;
        this.driver = driver;
    }

    @Override
    public void addDriver(DriverComponent driverComponent) {
        // Do nothing because is leaf
    }

    @Override
    public void deleteDriver(DriverComponent driverComponent) {
        // Do nothing because is leaf
    }

    @Override
    public void view() {
        System.out.println(this.driver.getId());
    }

    @Override
    public boolean isComposite() {
        return false;
    }

}
