package company;

import company.creatures.Animal;
import company.creatures.Human;
import company.devices.Car;
import company.devices.Phone;

public class Main{
    public static void main(String[] args)
    {
//--------------------------------------------------------------------------------------------
        Car car = new Car(0,"C2", "Citroen", 175000.2, "black", 146.1, 165.9, 5000.0, 2001) {
            @Override
            public void refuel() {

            }
        };
        Car car1 = new Car(1,"C3", "Citroen", 175000.2, "black", 146.1, 165.9, 100.0, 2005) {
            @Override
            public void refuel() {

            }
        };
        Car car2 = new Car(2,"C5", "Citroen", 175000.2, "black", 146.1, 165.9, 10000.0, 2022) {
            @Override
            public void refuel() {

            }
        };
        Car car3 = new Car(3,"XSARA", "Citroen", 175000.2, "black", 146.1, 165.9, 1000000.0, 2015) {
            @Override
            public void refuel() {

            }
        };
        Car car4 = new Car(4,"XSARA", "Citroen", 175000.2, "black", 146.1, 165.9, 1000000.0, 2015) {
            @Override
            public void refuel() {

            }
        };
        Phone phone1 = new Phone(111222333,100,  "Samsung", "S22");
        Phone phone2 = new Phone(111222333, 200,  "Samsung", "S22");

        Animal dog = new Animal("labrador") {

            @Override
            public void feed() {
            }

            @Override
            public void feed(double foodWeight) {

            }
        };
        dog.name = "Szarik";
        dog.isAlive = true;

        Human me = new Human(2);
        me.firstName = "Jan";
        me.lastName = "Krogul";
        //me.getCar(1, car);
        me.setCar(car);
        me.setCar(car1);
        me.setPhone(phone1);
        me.setCash(3500.0);

        Human seller = new Human(1);
        seller.setPhone(phone2) ;
        seller.firstName = "Jakub" ;
        seller.lastName = "Jakubowski";
        seller.pet = dog;
        seller.setCar(car2);
        seller.setPhone(phone2);
        seller.cash = 4000.0;

        Human buyer = new Human(1);
        buyer.firstName = "Krzysztof";
        buyer.lastName = "Kowalski";
        buyer.setCash(2000.0);
//------------------------------------------------------------------------
//pies--------------------------------------------------------------------
        System.out.println(me.firstName + " masz zwierze, nazywa się: " + dog.name);
        System.out.println("Czy żyje? " + dog.isAlive);
        System.out.println("Gatunek: " + dog.species);

        System.out.println("Ile waży pies: " + dog.getWeight());
        dog.feed(0.5);
        dog.feed();
        //po dodaniu interfejsu Feedable nie jestem w stanie naprawić aby dodawało wagi do zwierzaka
        System.out.println("Teraz pies waży: " + dog.getWeight() + "\n");
        int x = 5;
        for(int i = 0; x >= i; i++){
            dog.takeForAWalk();
        }
        System.out.println("Teraz pies waży: " + dog.getWeight());
//------------------------------------------------------------------------
        System.out.println(me.getYourSalary());

        System.out.println("\n" + car1);
        System.out.println(car3.equals(car4));
        System.out.println(car1.equals(car2));
        System.out.println(car3);
        System.out.println(car4);

        System.out.println("\n");System.out.println("\n");System.out.println("\n");System.out.println("\n");

        System.out.println(me);
        System.out.println(car);
        System.out.println(dog);
        car.turnOn();
        phone1.turnOn();

        System.out.println("\n");System.out.println("\n");System.out.println("\n");System.out.println("\n");

        System.out.println(seller);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
       // System.out.println(me);

        System.out.println("komentarz");
        System.out.println(seller.cash);
        Animal.salleable.sell(seller, buyer, 50.0);
        System.out.println(buyer.cash);
        System.out.println(seller.cash);
        //me.getGarageValue();
    }
}