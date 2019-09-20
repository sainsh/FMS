package fms;

import java.time.LocalDate;


public class TankerTest extends FreighterBaseTest {

    public void testCreateTankerFakeIt() {

        final String name = "Seawise Giant";
        final LocalDate launchDate = LocalDate.of(1979, 12, 4);
        final int dwt = 564763;
        final int tonnageVolume = 0;
        final Status status = Status.DockedAtHome;
        final String cargoDescription = "empty";

        Tanker tanker = new Tanker(name, launchDate, dwt, cargoDescription, tonnageVolume, status);

        super.testCreateFreighter(tanker,name,launchDate,dwt,status);

        assertEquals(tonnageVolume, tanker.getTonnageVolume());



    }

    public void testCreateTanker() {

        final String name = "Exxon Valdez";
        final LocalDate launchDate = LocalDate.of(1986, 10, 14);
        final int dwt = 214861;
        final int tonnageVolume = 0;
        final Status status = Status.DockedAtHome;
        final String cargoDescription = "empty";

        Tanker tanker = new Tanker(name, launchDate, dwt, cargoDescription, tonnageVolume, status);

        super.testCreateFreighter(tanker,name,launchDate,dwt,status);

        assertEquals(tonnageVolume, tanker.getTonnageVolume());


    }

    public void testChangeName() {


        final String newName = "Mediterranean";

        Tanker tanker = createTanker();

        super.testChangeName(tanker, newName);



    }

    public void testChangeStatus() {

        Tanker tanker = createTanker();

        super.testChangeStatus(tanker);

    }

    public void testChangeCargoDescriptionWhileDockedAtHome() {

        final String cargoDescription = "crude oil";

        Tanker tanker = createTanker();

        super.testChangeCargoDescriptionWhileDockedAtHome(tanker,cargoDescription);


    }

    public void testChangeCargoDescriptionWhileOnVoyage() {

        final String cargoDescription = "crude oil";

        Tanker tanker = createTanker();

        super.testChangeCargoDescriptionFailOnVoyage(tanker,cargoDescription, "Empty");


    }

    public void testChangeCargoDescriptionWhileDockedAway() {

        final String cargoDescription = "crude oil";

        Tanker tanker = createTanker();

        super.testChangeCargoDescriptionWhileDockedAtHome(tanker,cargoDescription);

    }

    public void testFullReport() {

        Tanker tanker = createTanker();

        final String output = "Name: " + tanker.getName() + ", Launch Date: " + tanker.getLaunchDate() +
                ", Dead Weight Tonnage: " + tanker.getDeadWeightTonnage() + ", Tonnage Volume: " +
                tanker.getTonnageVolume() + ", Status: " + tanker.getStatus() + ", Cargo: " + tanker.getCargoDescription() +
                ".";

        super.testFullReport(tanker,output);
    }


    public Tanker createTanker() {
        final String name = "Exxon Valdez";
        final LocalDate launchDate = LocalDate.of(1986, 10, 14);
        final int dwt = 214861;
        final int tonnageVolume = 0;
        final Status status = Status.DockedAtHome;
        final String cargoDescripion = "Empty";

        return new Tanker(name, launchDate, dwt, cargoDescripion, tonnageVolume, status);
    }


}
