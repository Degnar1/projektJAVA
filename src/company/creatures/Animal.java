package company.creatures;
import company.devices.Car;
import company.salleable;

public abstract class Animal implements salleable, Feedable {
    public String species;
    public String name;
    private Double weight;

    public Animal() {

    }

    private static final Double DEFAULT_LABRADOR_WEIGHT = 8.0;
    private static final Double DEFAULT_JAMNIK_WEIGHT = 2.5;
    private static final Double DEFAULT_OWCZAREK_WEIGHT = 15.0;
    public Boolean isAlive;
   // public Double getWeight() {
   //     return weight;
   // }

    protected Animal(String species) {
        this.isAlive = true;
        this.species = species;

        switch (species) {
            case "labrador" -> this.weight = DEFAULT_LABRADOR_WEIGHT;
            case "jamnik" -> this.weight = DEFAULT_JAMNIK_WEIGHT;
            case "owczarek" -> this.weight = DEFAULT_OWCZAREK_WEIGHT;
        }

    }
    @Override
    public void feed(Double foodWeight){
        feed(0.5);
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("Dzięki za żarcie");
        }
    }
    @Override
    public void feed() {
        if (this.isAlive) {
            this.weight += 0.5;
            System.out.println("Dzięki za żarcie");
        }
    }
    public Double getWeight() {
        return this.weight;
    }

    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight -= 1.0;
            if (this.weight <= 0) {
                System.out.println("\nZabiłeś psa!");
                this.isAlive = false;
            } else {
                System.out.println("Dzięki za spacer");
            }
        } else {
            System.out.println("Dzwonie na policje!\n");
        }
    }

    public String toString() {
        return "waga: " + this.weight + "kg, Czy żyje: " + this.isAlive + ", rasa: " + this.species + ", imie: " + this.name;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    public static salleable salleable = new salleable() {
        Car car = new Car(5,"C2", "Citroen", 175000.2, "black", 146.1, 165.9, 5000.0, 2001) {
            @Override
            public void refuel() {

            }
        };

        @Override
        public void sell(Human seller, Human buyer, Double price) {
            System.out.println(buyer.cash);
            if (buyer.getCash() >= price) {
                if (seller.getPet() == null) {
                    System.out.println("sprzedający nie ma zwierzęcia na sprzedaż");
                } else {
                    System.out.println("kupiłeś zwierzę");
                    buyer.cash -= price;
                    System.out.println(buyer.cash);
                    buyer.setPet();
                    seller.cash += price;
                }

                if (seller.getCar(0, car) == null) {
                    System.out.println("sprzedający nie ma auta na sprzedaż");
                } else {
                    System.out.println("kupiłeś auto");
                    buyer.setSalary(-price);
                    buyer.setCar(car);
                    seller.cash += price;
                }
                if (seller.getPhone() == null) {
                    System.out.println("sprzedający nie ma telefonu na sprzedaż");
                } else {
                    System.out.println("kupileś telefon");
                }
            } else {
                System.out.println("masz za mało pieniążków");
            }

        }
    };


    public String getName() {
        return name;
    }
}

