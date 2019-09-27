package fms;

import junit.framework.TestCase;

import java.time.LocalDate;
import java.util.ArrayList;

public class FleetTest extends TestCase {

    public void testCreateFleetFakeIt() {

        Fleet fleet = new Fleet(new ArrayList<>());

        assertEquals(0, fleet.getFreighters().size());
        assertEquals(0, fleet.getTotalDeadWeightTonnage());
    }

    public void testCreateFleet() {

        Fleet fleet = createFleet();
        final int expectedTotalDWT = 241227;


        assertEquals(2, fleet.getFreighters().size());
        assertEquals(expectedTotalDWT, fleet.getTotalDeadWeightTonnage());

    }

    public void testEmptyFleetNumberOfShipsLaunchedAfter(){

        Fleet fleet = new Fleet(new ArrayList<>());

        assertEquals(0,fleet.getNumberOfShipsLaunchedAfter(LocalDate.of(1900,1,1)));
    }

    public void testNumberOfShipsLaunchedAfter(){
        Fleet fleet= createFleet();

        assertEquals(1,fleet.getNumberOfShipsLaunchedAfter(LocalDate.of(1987,5,1)));
    }

    public void testChangeCargoAndStatusAndDisplayReport(){

        Fleet fleet = createFleet();

        Freighter ship = fleet.getFreighterByName("Hansa Carrier");

        ship.setCargoDescription("Nike shoes");
        ship.setStatus(Status.OnVoyage);

        final String output = "Name: " + ship.getName() + ", Launch Date: " + ship.getLaunchDate() +
                ", Dead Weight Tonnage: " + ship.getDeadWeightTonnage() + ", Container Count: " +
                ((ContainerShip)ship).getContainerCount() + ", Status: " + ship.getStatus() + ", Cargo: " + ship.getCargoDescription() +
                ".";

        assertEquals(output,ship.toString());
    }

    public void testRemoveFreighterFromFleet(){

        Fleet fleet = createFleet();

        String tName = "Exxon Valdez";

        fleet.removeFreighter(tName);

        assertEquals(1, fleet.getNumberOfFreighters());
        assertEquals(null, fleet.getFreighterByName(tName));

    }

    public void testTotalDeadWeightTonnageDockedAtHome(){
        Fleet fleet = createFleet();

        assertEquals(241227,fleet.getTotalDeadWeightTonnage());
        fleet.getFreighterByName("Hansa Carrier").setStatus(Status.OnVoyage);
        assertEquals(214861,fleet.getTotalDeadWeightTonnageWithStatus(Status.DockedAtHome));
    }

    public void testContainerCountOnVoyage(){
        Fleet fleet = createFleet();

        assertEquals(0, fleet.getContainerCountWithStatus(Status.OnVoyage));


        ((ContainerShip)fleet.getFreighterByName("Hansa Carrier")).setContainerCount(1799);
        fleet.getFreighterByName("Hansa Carrier").setStatus(Status.OnVoyage);

        assertEquals(1799, fleet.getContainerCountWithStatus(Status.OnVoyage));


    }

    private Fleet createFleet() {
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

        return new Fleet(new ArrayList<>() {
            {
                add(containerShip);
                add(tanker);
            }
        });

    }
}
