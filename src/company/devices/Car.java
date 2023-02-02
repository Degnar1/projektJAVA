package company.devices;

public abstract class Car extends Device {
    public String producer;
    public String model;
    public Double millage;
    public String colour;
    public Double height;
    public Double width;
    public Double value;
    public int garageNumber;


    public Car(int garageNumber, String model, String producer, Double millage, String colour, Double height, Double width, Double value, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
        this.garageNumber = garageNumber;
        this.model = model;
        this.producer = producer;
        this.millage = millage;
        this.colour = colour;
        this.height = height;
        this.width = width;
        this.value = value;
    }

    public String toString() {
        return super.toString() + " millage: " + this.millage + " colour: " + this.colour + " height: " + this.height + " width: " + this.width + " value: " + this.value;

    }
    public void turnOn(){
       System.out.println("Car odpalony.");
    }
    public abstract void refuel();


}


