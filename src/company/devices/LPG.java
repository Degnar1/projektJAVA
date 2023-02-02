package company.devices;

public class LPG extends Car{
    public LPG(int garageNumber, String model, String producer, Double millage, String colour, Double height, Double width, Double value, Integer yearOfProduction) {
        super(garageNumber, model, producer, millage, colour, height, width, value, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
