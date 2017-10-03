package patterns.composite;

public interface DriverComponent {
    public void addDriver(DriverComponent driverComponent);

    public void deleteDriver(DriverComponent driverComponent);

    public String view();

    public boolean isComposite();

    public int size();

}
