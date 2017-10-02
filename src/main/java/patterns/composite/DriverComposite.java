package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class DriverComposite extends DriverComponent {
    private String name;

    private List<DriverComponent> driverComponentList;

    public DriverComposite(String name) {
        super();
        assert name != null;
        this.driverComponentList = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addDriver(DriverComponent driverComponent) {
        assert driverComponent != null;
        this.driverComponentList.add(driverComponent);
    }

    @Override
    public void deleteDriver(DriverComponent driverComponent) {
        assert driverComponent != null;
        this.driverComponentList.remove(driverComponent);
    }

    @Override
    public int size() {
        return driverComponentList.size();
    }

    @Override
    public void view() {
        System.out.println(this.name);
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public String getViewMessage() {
        return this.name;
    }

}
