package fms;

import junit.framework.TestCase;

import java.time.LocalDate;

public class ContainerShipTest extends TestCase {

    final String cargoDescription = "Nike shoes";
    final String cargoDescriptionEmpty = "Empty";

    public void testCreateContainerShipMarcoPolo(){

        final String name = "Marco Polo";
        final LocalDate lauchDate = LocalDate.of(2012,11,2);
        final int deadWeightTonnage = 187625;
        final int containerCount = 0;
        final Status status = Status.DockedAtHome;

        ContainerShip containerShip = new ContainerShip(name,lauchDate,deadWeightTonnage,"NA",containerCount,status);

        assertEquals(name, containerShip.getName());
        assertEquals(lauchDate, containerShip.getLaunchDate());
        assertEquals(deadWeightTonnage, containerShip.getDeadWeightTonnage());
        assertEquals(containerCount, containerShip.getContainerCount());
        assertEquals(status, containerShip.getStatus());

    }

    public void testCreateContainerShipHansaCarrier(){
        final String name = "Hansa Carrier";
        final LocalDate lauchDate = LocalDate.of(1989,2,1);
        final int deadWeightTonnage = 26366;
        final int containerCount = 0;
        final Status status = Status.DockedAtHome;

        ContainerShip containerShip = createContainerShip();

        assertEquals(name, containerShip.getName());
        assertEquals(lauchDate, containerShip.getLaunchDate());
        assertEquals(deadWeightTonnage, containerShip.getDeadWeightTonnage());
        assertEquals(containerCount, containerShip.getContainerCount());
        assertEquals(status, containerShip.getStatus());
    }

    public void testChangeName(){
        ContainerShip containerShip = createContainerShip();
        final String newName = "Ocean Hope";

        assertTrue(containerShip.setName(newName));
        assertEquals(newName, containerShip.getName());
    }

    public void testChangesStatus(){

        ContainerShip ship = createContainerShip();

        assertEquals(Status.DockedAtHome, ship.getStatus());

        ship.setStatus(Status.OnVoyage);

        assertEquals(Status.OnVoyage, ship.getStatus());

        ship.setStatus(Status.DockedAway);

        assertEquals(Status.DockedAway,ship.getStatus());


    }
    public void testChangeCargoDescription(){



        ContainerShip ship = createContainerShip();

        assertFalse(ship.getCargoDescription().equals(cargoDescription));

        ship.setCargoDescription(cargoDescription);

        assertTrue(ship.getCargoDescription().equals(cargoDescription));
    }

    public void testChangeCargoDescriptionFailOnVoyage(){



        ContainerShip ship = createContainerShip();
        ship.setCargoDescription(cargoDescription);

        assertEquals(cargoDescription, ship.getCargoDescription());

        ship.setStatus(Status.OnVoyage);

        assertEquals(Status.OnVoyage, ship.getStatus());

        ship.setCargoDescription(cargoDescriptionEmpty);

        assertFalse(ship.getCargoDescription().equals(cargoDescriptionEmpty));


    }

    public void testChangeCargoDescriptionDockedAway(){

        ContainerShip ship = createContainerShip();
        ship.setCargoDescription(cargoDescription);

        assertEquals(cargoDescription, ship.getCargoDescription());

        ship.setStatus(Status.DockedAway);
        assertEquals(Status.DockedAway, ship.getStatus());

        ship.setCargoDescription(cargoDescriptionEmpty);

        assertEquals(cargoDescriptionEmpty, ship.getCargoDescription());

    }



    public ContainerShip createContainerShip(){
        final String name = "Hansa Carrier";
        final LocalDate lauchDate = LocalDate.of(1989,2,1);
        final int deadWeightTonnage = 26366;
        final int containerCount = 0;
        final Status status = Status.DockedAtHome;
        final String cargoDescription = "Empty";


        ContainerShip containerShip = new ContainerShip(name, lauchDate, deadWeightTonnage,cargoDescription, containerCount, status);

        return containerShip;
    }

}
