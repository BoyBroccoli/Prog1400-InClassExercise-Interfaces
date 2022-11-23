package operatorPackages;

public class Pilot extends Operator{

    private int loggedHours;

    // Getter
    public int getLoggedHours() {
        return loggedHours;
    }

    // Setter
    public void setLoggedHours(int loggedHours) {
        this.loggedHours = loggedHours;
    }

    // Overriding operatorPackages.Operator renewLicense method
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
