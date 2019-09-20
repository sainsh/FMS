package fms;

import java.time.LocalDate;

public class ContainerShip {

    private String cargoDescription;
    private String name;
    private final LocalDate launchDate;
    private final int deadWeightTonnage;
    private Status status;
    private int containerCount;

    public ContainerShip(String name, LocalDate launchDate, int deadWeightTonnage, String cargoDescription, int containerCount, Status status ) {
        this.name = name;
        this.launchDate = launchDate;
        this.deadWeightTonnage = deadWeightTonnage;
        this.cargoDescription = cargoDescription;
        this.containerCount = containerCount;
        this.status = status;
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

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public boolean setName(String newName) {
        name = newName;
        return true;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCargoDescription() {
        return cargoDescription;
    }

    public void setCargoDescription(String cargoDescription) {
        if (status != Status.OnVoyage) {
            this.cargoDescription = cargoDescription;

        }
    }
}
