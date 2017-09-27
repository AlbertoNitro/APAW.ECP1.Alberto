package entity;

public class Driver {

    private int id;

    private String reference;

    private long phone;

    private Level level;

    private Car car;

    public Driver(int id, Level level, Car car) {
        this.id = id;
        this.level = level;
        this.car = car;
    }
    
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

    public void setId(int id) {
        this.id = id;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
