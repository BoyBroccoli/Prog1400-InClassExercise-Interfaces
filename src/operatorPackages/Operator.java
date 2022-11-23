package operatorPackages;

import interfacePackages.*;

public abstract class Operator implements Insurable {

    private String name;

    public Operator(){};

    public Operator(String name){
        this.name=name;
    }

    public void renewLicense(){};


    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
