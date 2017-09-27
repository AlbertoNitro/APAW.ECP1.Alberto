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
}
