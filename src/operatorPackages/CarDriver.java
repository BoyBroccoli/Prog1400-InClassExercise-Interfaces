package operatorPackages;

public class CarDriver extends Operator{

    private String driverLicense;



    // Getter

    public String getDriverLicense() {
        return driverLicense;
    }

    // Setter

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public void renewLicense() {
        System.out.println("operatorPackages.Pilot License Renewed!");
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
}
