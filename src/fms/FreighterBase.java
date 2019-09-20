package fms;

import java.time.LocalDate;

public abstract class  FreighterBase implements Freighter {

    private String cargoDescription;
    private String name;
    private final LocalDate launchDate;
    private final int deadWeightTonnage;
    private Status status;

    public FreighterBase(String name, LocalDate launchDate, int deadWeightTonnage, String cargoDescription, Status status){
        this.name = name;
        this.launchDate = launchDate;
        this.deadWeightTonnage = deadWeightTonnage;
        this.cargoDescription = cargoDescription;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getDeadWeightTonnage() {
        return deadWeightTonnage;
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
    @Override
    public String toString() {
        return "Name: " + getName() + ", Launch Date: " + getLaunchDate() + ", Dead Weight Tonnage: " + getDeadWeightTonnage() +
                ", Status: " + getStatus() + ", Cargo: " + getCargoDescription() + ".";
    }

}
