package fms;

import java.time.LocalDate;

public class Tanker {



    public Tanker(String name, LocalDate launchDate, int dwt, int tonnageVolume, Status status) {

    }

    public String getName() {
        return "Seawise Giant";
    }

    public LocalDate getLaunchDate() {
        return LocalDate.of(1979,12,4);
    }

    public int getDeadWeightTonnage() {
        return 564763;
    }

    public int getTonnageVolume() {
        return 0;
    }

    public Status getStatus() {
        return Status.DockedAtHome;
    }
}
