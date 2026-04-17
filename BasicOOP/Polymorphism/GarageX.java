
abstract class Vehicle {
    String name;
    String company;
    Engine engine;

    public Vehicle(String name, String company) {
        if (this instanceof Car) {
            this.engine = new Engine(1300, "Petrol/Diesel");
        }
        if (this instanceof Bike) {
            this.engine = new Engine(100, "petrol");
        }
        this.name = name;
        this.company = company;
    }

}

class Engine {
    private int cc;
    private String fueltype;

    public Engine(int cc, String fueltype) {
        this.cc = cc;
        this.fueltype = fueltype;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getFueltype() {
        return fueltype;
    }

    @Override
    public String toString() {
        return String.format("\nEngine: %d | Fueltype: %s", cc, fueltype);
    }
}

class Car extends Vehicle {

    public Car(String name, String company) {
        super(name, company);
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Company: %s", name, company) + engine.toString();
    }
}

class Bike extends Vehicle {

    public Bike(String name, String company) {
        super(name, company);
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Company: %s", name, company) + engine.toString();
    }
}

public class GarageX {
    public static void main(String[] args) {
        Vehicle Honda1 = new Car("Civic", "Honda");
        Vehicle Honda2 = new Car("Civic", "Honda");
        Vehicle Honda3 = new Bike("GC 125", "Honda");
        Vehicle Honda4 = new Bike("CD 70", "Honda");
        Vehicle Toyota1 = new Car("Fortuner", "Toyota");
        Vehicle Toyota2 = new Car("Prius", "Toyota");
        Vehicle BMW1 = new Car("BMW m4 ", "BMW");
        Vehicle Audi1 = new Car("Audi eTron GT", "Audi");

        // Polymorphism
        int i = 0;
        for (Vehicle currVehicle : new Vehicle[] { Honda1, Honda2, Honda3, Honda4, Toyota1, Toyota2, BMW1, Audi1 }) {
            System.out.println(currVehicle.toString());
            ++i;
        }
        System.out.println("Total Vehicles: " + i);

        System.out.println("-=====CARS GARAGE=====-");
        int j = 0;
        for (Vehicle curVehicle : new Vehicle[] { Honda1, Honda2, Honda3, Honda4, Toyota1, Toyota2, BMW1, Audi1 }) {
            if (curVehicle instanceof Car) {
                ++j;
                Vehicle v = (Car) curVehicle;
                System.out.println(v);
            }
            System.out.println("Total cars: " + j);
        }
    }
}