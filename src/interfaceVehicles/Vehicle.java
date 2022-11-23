package interfaceVehicles;

import interfacePackages.*;

public abstract class Vehicle implements Insurable {

    // Instance Variable
    private String make;
    private String model;

    // Blank Constructor
    public Vehicle(){};

    // Constructor
    public Vehicle(String make, String model){
        this.make=make;
        this.model=model;
    }

    // Methods
    public void makeSound(){
        System.out.println("Make a General Sound");
    }

    // Getter
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // Setter

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Dont need override Interface bc interfaceVehicles.Vehicle is the Parent
//    // Overriding Interface interfacePackages.Insurable
//
//    @Override
//    public void setRate() {
//        System.out.println("Set insurance rate for: " + this.getClass().getSimpleName());
//    }
//
//    @Override
//    public void setTerm() {
//        System.out.println("Set term rate for: " + this.getClass().getSimpleName());
//    }
}
