package fms;

public class ContainerShip {

    private final String name = "Marco Polo";
    private final int deadWeightTonnage = 187625;
    private final Status status = Status.DockedAtHome;
    private final int containerCount = 0;

    public ContainerShip(String name) {
        
    }

    public String getName() {
        return name;
    }

    public int getDeadWeightTonnage() {
        return deadWeightTonnage;
    }

    public int getContainerCount() {
        return containerCount;
    }

    public Status getStatus() {
        return status;
    }
}
