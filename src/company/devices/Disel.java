package company.devices;

public class Disel extends Car{
    public Disel(int garageNumber,String model, String producer, Double millage, String colour, Double height, Double width, Double value, Integer yearOfProduction) {
        super(garageNumber,model, producer, millage, colour, height, width, value, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
