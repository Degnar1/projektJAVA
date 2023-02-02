package company.creatures;
import company.devices.Car;
import company.devices.Phone;

import java.time.LocalDateTime;

public class Human
{
    public String firstName;
    public String lastName;
    public Animal pet;
    //private Car car;
    private Car[] garage;
    private Double Salary;
    LocalDateTime localDateTime1 = LocalDateTime.now();
    private company.devices.Phone Phone;
    private company.devices.Phone phone;
    public Double cash;
    private int garageNumber;

    public Human(int garageSize){
        super();
        this.Salary = 3500.0;
        this.garage = new Car[garageSize];
    }

    public Double getYourSalary()
    {
        System.out.println("Last report time and salary: ");
        System.out.println("LocalDateTime #1: " + localDateTime1);
        System.out.println("Your salary: " + Salary);
        return Salary;
    }
    Double getCash(){
        return this.cash;
    }
    public void setCash(double cash){
        this.cash = cash*3;
    }
    public void setSalary(Double salary) {
        if(salary>0) {
            this.Salary = salary;
            System.out.println("Data in the accounting system has been changed");
            System.out.println("Please collect the annex to the contract from Mrs. Hanna from the HR department");
            System.out.println("ZUS and US know about your the salarys change. There is no point in hiding it :)");
            System.out.println("Your new salary: " + salary);
        } else {
            System.out.println("Salary must be greater than 0");
        }
    }

    public Car getCar(int garageNumber, Car car)
    {
        return this.garage[garageNumber];
    }

    public void setCar(Car car){
        if (garageNumber >= 0 && garageNumber < garage.length) {
            if (Salary > car.value) {
                System.out.println("You have bought a car!");
                this.garage[0] = car;
            } else if (Salary > car.value / 12) {
                System.out.println("you bought a car but on credit!");
                this.garage[0] = car;
            } else {
                System.out.println("Enroll in college and find a new job or go for a raise...");
            }
        }
    }

    public String toString() {
        return "Imie: " + this.firstName + " nazwisko: " + this.lastName + "\nauto: " + this.garage[0] + "\nzwierze: " + this.pet + "\ntelefon: " + this.Phone;
    }
    public Animal getPet() {
        return pet;
    }
    public void setPet() {
        this.pet = pet;
    }
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.Phone = phone;
    }
   /* public double getGarageValue(){
        double sum = 0;
        for (int i = 0; i < garage.length; i++) {
            if(garage[i] != null){
                sum += garage[i].value;
            }
        }
        return sum;
    }*/
}