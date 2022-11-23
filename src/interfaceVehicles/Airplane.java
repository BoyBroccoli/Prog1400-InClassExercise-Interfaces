package interfaceVehicles;
import interfacePackages.*;

public class Airplane extends Vehicle implements Rentables{

    private double wingLength;


    // Getters
    public double getWingLength() {
        return wingLength;
    }

    // Setters
    public void setWingLength(double wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Plane sound whirl whirl whirl!");
    }


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
