
class Vehicle {
    int wheels;
    String name;

    public Vehicle(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }
}


public class CarextendsVehicle extends Vehicle{
      int millage;
    String model;

    public CarextendsVehicle(int wheels, String name, int millage, String model) {
        super(wheels, name); 
        this.millage = millage;
        this.model = model;
    }

    void getDetails() {
        System.out.println("Car Details: " + model + " " + millage);
        System.out.println("Base Vehicle: " + name + ", Wheels: " + wheels);
    }

    public static void main(String args[]) {
        CarextendsVehicle car = new CarextendsVehicle(4, "Skoda", 20, "Superb");
        car.getDetails();
    }
}

