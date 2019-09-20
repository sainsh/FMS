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
        String output = super.toString();
        int first = output.indexOf(",");
        int second = output.indexOf(",", first+1);
        int third = output.indexOf(",",second+1);

        String firstPart = output.substring(0,third);
        String lastPart = output.substring(third);

        String middlePart = ", Container Count: "+ containerCount;

        return firstPart + middlePart + lastPart;
    }
}
