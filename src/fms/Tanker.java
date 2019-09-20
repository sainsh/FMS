package fms;

import java.time.LocalDate;

public class Tanker extends FreighterBase{

    private int tonnageVolume;



    public Tanker(String name, LocalDate launchDate, int dwt, String cargoDescription, int tonnageVolume, Status status) {
        super(name, launchDate,dwt, cargoDescription, status);

        this.tonnageVolume = tonnageVolume;


    }

    public int getTonnageVolume() {
        return tonnageVolume;
    }


}
