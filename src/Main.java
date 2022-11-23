import interfacePackages.*;
import interfaceVehicles.*;
import operatorPackages.*;

public class Main {
    public static void main(String[] args) {
        Insurable vehicleInsurance = new Car();
        vehicleInsurance.setRate();

        Insurable vehicleInsurance2 = new Boat();
        vehicleInsurance2.setTerm();

        // downcasting and polymorphism
        Boat boat1 = (Boat) vehicleInsurance2;
        boat1.makeSound();


    }
}