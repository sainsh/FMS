package fms;

import java.time.LocalDate;

public class ContainerShip {

    private String name;
    private final LocalDate launchDate;
    private final int deadWeightTonnage;
    private Status status = Status.DockedAtHome;
    private int containerCount;

    public ContainerShip(String name, LocalDate lauchDate, int deadWeightTonnage, int containerCount, Status status) {
        this.name = name;
        this.launchDate = lauchDate;
        this.deadWeightTonnage = deadWeightTonnage;
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
}
