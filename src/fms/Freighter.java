package fms;

import java.time.LocalDate;

public interface Freighter {

    String getName();

    int getDeadWeightTonnage();


    Status getStatus();

    LocalDate getLaunchDate();

    boolean setName(String newName);

    void setStatus(Status status);

    String getCargoDescription();

    void setCargoDescription(String cargoDescription);

}
