package fms;

import junit.framework.TestCase;

import java.time.LocalDate;


public class TankerTest extends TestCase {

    public void testCreateTankerFakeIt(){

        final String name = "Seawise Giant";
        final LocalDate launchDate = LocalDate.of(1979,12,4);
        final int dwt = 564763;
        final int tonnageVolume = 0;
        final Status status = Status.DockedAtHome;
        final String cargoDescripion ="empty";

        Tanker tanker = new Tanker(name,launchDate,dwt, cargoDescripion,tonnageVolume,status);

        assertEquals(name, tanker.getName());
        assertEquals(launchDate, tanker.getLaunchDate());
        assertEquals(dwt, tanker.getDeadWeightTonnage());
        assertEquals(tonnageVolume, tanker.getTonnageVolume());
        assertEquals(status, tanker.getStatus());



    }

    public void testCreateTanker(){

        final String name = "Exxon Valdez";
        final LocalDate launchDate = LocalDate.of(1986,10,14);
        final int dwt = 214861;
        final int tonnageVolume = 0;
        final Status status = Status.DockedAtHome;
        final String cargoDescripion ="empty";

        Tanker tanker = new Tanker(name,launchDate,dwt, cargoDescripion,tonnageVolume,status);

        assertEquals(name, tanker.getName());
        assertEquals(launchDate, tanker.getLaunchDate());
        assertEquals(dwt, tanker.getDeadWeightTonnage());
        assertEquals(tonnageVolume, tanker.getTonnageVolume());
        assertEquals(status, tanker.getStatus());


    }

    public void testChangeName(){
        final String name = "Exxon Valdez";

        final String newName = "Mediterranean";

        Tanker tanker = createTanker();

        assertEquals(name, tanker.getName());

        tanker.setName(newName);

        assertEquals(newName, tanker.getName());


    }
    public void testChangeStatus(){

        Tanker tanker = createTanker();

        assertEquals(Status.DockedAtHome, tanker.getStatus());

        tanker.setStatus(Status.OnVoyage);

        assertEquals(Status.OnVoyage, tanker.getStatus());

        tanker.setStatus(Status.DockedAway);

        assertEquals(Status.DockedAway,tanker.getStatus());

    }
    public void testChangeCargoDescriptionWhileDockedAtHome(){

        final String cargoDescription = "crude oil";

        Tanker tanker = createTanker();

        assertEquals(Status.DockedAtHome, tanker.getStatus());
        assertEquals("empty", tanker.getCargoDescription());

        tanker.setCargoDescription(cargoDescription);

        assertEquals(cargoDescription, tanker.getCargoDescription());

    }
    public void testChangeCargoDescriptionWhileOnVoyage(){

        final String cargoDescription = "crude oil";

        Tanker tanker = createTanker();

        assertEquals(Status.DockedAtHome, tanker.getStatus());
        assertEquals("empty", tanker.getCargoDescription());
        tanker.setStatus(Status.OnVoyage);
        assertEquals(Status.OnVoyage, tanker.getStatus());

        tanker.setCargoDescription(cargoDescription);

        assertFalse(tanker.getCargoDescription().equals(cargoDescription));

    }
    public void testChangeCargoDescriptionWhileDockedAway(){

        final String cargoDescription = "crude oil";

        Tanker tanker = createTanker();

        assertEquals(Status.DockedAtHome, tanker.getStatus());
        assertEquals("empty", tanker.getCargoDescription());

        tanker.setCargoDescription(cargoDescription);

        assertEquals(cargoDescription, tanker.getCargoDescription());

    }

    public Tanker createTanker(){
        final String name = "Exxon Valdez";
        final LocalDate launchDate = LocalDate.of(1986,10,14);
        final int dwt = 214861;
        final int tonnageVolume = 0;
        final Status status = Status.DockedAtHome;
        final String cargoDescripion ="empty";

        return new Tanker(name,launchDate,dwt, cargoDescripion,tonnageVolume,status);
    }





}
