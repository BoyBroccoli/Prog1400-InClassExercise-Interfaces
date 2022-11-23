package interfaceVehicles;

import interfacePackages.*;

public class Boat extends Vehicle implements Rentables {

    public void makeSound(){
        System.out.println("Make a toot toot sound.");
    }

    // Overriding Interface interfacePackages.Insurable

    @Override
    public void setRate() {
        System.out.println("Set insurance rate for: " + this.getClass().getSimpleName());
    }

    @Override
    public void setTerm() {
        System.out.println("Set term rate for: " + this.getClass().getSimpleName());
    }

    @Override
    public void setDuration() {
        System.out.println("Set Duration for: " + this.getClass().getSimpleName());
    }

    @Override
    public void setRentalRate() {
        System.out.println("Set Rental Rate for: " + this.getClass().getSimpleName());
    }

}
