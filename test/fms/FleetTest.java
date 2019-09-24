package fms;

import junit.framework.TestCase;

import java.time.LocalDate;
import java.util.ArrayList;

public class FleetTest extends TestCase {

    public void testCreateFleetFakeIt() {

        Fleet fleet = new Fleet(new ArrayList<Freighter>());
        int totalDWT = 0;

        for (Freighter ship :
                fleet.getFreighters()) {
            totalDWT += ship.getDeadWeightTonnage();

        }

        assertEquals(0, fleet.getFreighters().size());
        assertEquals(0, totalDWT);
    }

    public void testCreateFleet() {

        Fleet fleet = createFleet();
        final int expectedTotalDWT = 241227;

        int totalDWT = 0;
        for (Freighter ship : fleet.getFreighters()){
            totalDWT += ship.getDeadWeightTonnage();
        }

        assertEquals(2, fleet.getFreighters().size());
        assertEquals(expectedTotalDWT, totalDWT);

    }

    public Fleet createFleet() {
        final String cName = "Hansa Carrier";
        final LocalDate cLaunchDate = LocalDate.of(1989, 2, 1);
        final int cDeadWeightTonnage = 26366;
        final int containerCount = 0;
        final Status cStatus = Status.DockedAtHome;
        final String cCargoDescription = "Empty";


        ContainerShip containerShip = new ContainerShip(cName, cLaunchDate, cDeadWeightTonnage, cCargoDescription, containerCount, cStatus);

        final String name = "Exxon Valdez";
        final LocalDate launchDate = LocalDate.of(1986, 10, 14);
        final int dwt = 214861;
        final int tonnageVolume = 0;
        final Status status = Status.DockedAtHome;
        final String cargoDescripion = "Empty";

        Tanker tanker = new Tanker(name, launchDate, dwt, cargoDescripion, tonnageVolume, status);

        return new Fleet(new ArrayList<Freighter>() {
            {
                add(containerShip);
                add(tanker);
            }
        });

    }
}
