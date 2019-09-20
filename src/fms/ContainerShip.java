package fms;

import java.time.LocalDate;

public class ContainerShip extends FreighterBase{


    private int containerCount;

    public ContainerShip(String name, LocalDate launchDate, int deadWeightTonnage, String cargoDescription, int containerCount, Status status) {
        super(name,launchDate,deadWeightTonnage,cargoDescription,status);

        this.containerCount = containerCount;

    }

    public int getContainerCount() {
        return containerCount;
    }


    @Override
    public String toString() {
        return "Name: " + getName() + ", Launch Date: " + getLaunchDate() + ", Dead Weight Tonnage: " + getDeadWeightTonnage() +
                ", Container Count: " + containerCount + ", Status: " + getStatus() + ", Cargo: " + getCargoDescription() + ".";
    }
}
