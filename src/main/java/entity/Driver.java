package entity;

public class Driver {

    private int id;

    private String reference;

    private long phone;

    private Level level;

    private Car car;

    public Driver(int id, String reference, long phone, Level level, Car car) {
        this.id = id;
        this.reference = reference;
        this.phone = phone;
        this.level = level;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public long getPhone() {
        return phone;
    }

    public Level getLevel() {
        return level;
    }

    public Car getCar() {
        return car;
    }

}
