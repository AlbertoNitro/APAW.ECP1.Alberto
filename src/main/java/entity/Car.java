package entity;

public class Car {

    private int id;

    private String registration;

    private String model;

    public Car(int id, String registration, String model) {
        this.id = id;
        this.registration = registration;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public String getRegistration() {
        return registration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
