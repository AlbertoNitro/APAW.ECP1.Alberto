package composite;

public abstract class DriverComponent {
    public abstract void addDriver(DriverComponent driverComponent);

    public abstract void deleteDriver(DriverComponent driverComponent);

    public abstract void view();

    public abstract boolean isComposite();
    
    public abstract int size();
    
    public abstract String getViewMessage();

}
