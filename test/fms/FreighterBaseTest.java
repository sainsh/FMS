package fms;


import junit.framework.TestCase;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class FreighterBaseTest extends TestCase {

    public void testCreateFreighter(Freighter freighter, String name, LocalDate launchDate, int deadWeightTonnage, Status status){

        assertEquals(name, freighter.getName());
        assertEquals(launchDate, freighter.getLaunchDate());
        assertEquals(deadWeightTonnage, freighter.getDeadWeightTonnage());
        assertEquals(status, freighter.getStatus());

    }

    protected void testChangeName(Freighter freighter, String newName) {
        assertTrue(freighter.setName(newName));
        assertEquals(newName, freighter.getName());
    }

    protected void testChangeStatus(Freighter freighter) {

        assertEquals(Status.DockedAtHome, freighter.getStatus());

        freighter.setStatus(Status.OnVoyage);

        assertEquals(Status.OnVoyage, freighter.getStatus());

        freighter.setStatus(Status.DockedAway);

        assertEquals(Status.DockedAway, freighter.getStatus());
    }

    protected void testChangeCargoDescriptionWhileDockedAtHome(Freighter ship, String cargoDescription) {

        assertEquals(Status.DockedAtHome, ship.getStatus());
        assertEquals("Empty", ship.getCargoDescription());

        ship.setCargoDescription(cargoDescription);

        assertEquals(cargoDescription, ship.getCargoDescription());
    }

    protected void testChangeCargoDescriptionFailOnVoyage(Freighter ship, String cargoDescription, String cargoDescriptionEmpty) {
        ship.setCargoDescription(cargoDescription);

        assertEquals(cargoDescription, ship.getCargoDescription());

        ship.setStatus(Status.OnVoyage);

        assertEquals(Status.OnVoyage, ship.getStatus());

        ship.setCargoDescription(cargoDescriptionEmpty);

        assertFalse(ship.getCargoDescription().equals(cargoDescriptionEmpty));
    }

    protected void testChangeCargoDescriptionDockedAway(Freighter ship, String cargoDescription, String cargoDescriptionEmpty) {

        ship.setCargoDescription(cargoDescription);

        assertEquals(cargoDescription, ship.getCargoDescription());

        ship.setStatus(Status.DockedAway);
        assertEquals(Status.DockedAway, ship.getStatus());

        ship.setCargoDescription(cargoDescriptionEmpty);

        assertEquals(cargoDescriptionEmpty, ship.getCargoDescription());
    }

    protected void testFullReport(Freighter ship, String output) {

        assertEquals(output, ship.toString());
    }
}
