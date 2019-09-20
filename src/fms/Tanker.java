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

    @Override
    public String toString() {
        String output = super.toString();
        int first = output.indexOf(",");
        int second = output.indexOf(",", first+1);
        int third = output.indexOf(",",second+1);

        String firstPart = output.substring(0,third);
        String lastPart = output.substring(third);

        String middlePart = ", Tonnage Volume: "+ tonnageVolume;

        return firstPart + middlePart + lastPart;
    }
}
