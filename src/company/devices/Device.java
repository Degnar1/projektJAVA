package company.devices;

public abstract class Device {

    protected String producer;
    public final String model;
    public final Integer yearOfProduction;

    public abstract void turnOn();

    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return "Producer: " + this.producer + " production date: " + this.yearOfProduction + " model: " + this.model;
    }



}

