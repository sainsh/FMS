package fms;

import java.time.LocalDate;

public class ContainerShipTest extends FreighterBaseTest {

    final String cargoDescription = "Nike shoes";
    final String cargoDescriptionEmpty = "Empty";

    public void testCreateContainerShipFakeIt() {

        final String name = "Marco Polo";
        final LocalDate launchDate = LocalDate.of(2012, 11, 2);
        final int deadWeightTonnage = 187625;
        final int containerCount = 0;
        final Status status = Status.DockedAtHome;

        ContainerShip containerShip = new ContainerShip(name, launchDate, deadWeightTonnage, "NA", containerCount, status);

        super.testCreateFreighter(containerShip , name, launchDate,deadWeightTonnage,status);

        assertEquals(containerCount, containerShip.getContainerCount());


    }

    public void testCreateContainerShipHansaCarrier() {
        final String name = "Hansa Carrier";
        final LocalDate launchDate = LocalDate.of(1989, 2, 1);
        final int deadWeightTonnage = 26366;
        final int containerCount = 0;
        final Status status = Status.DockedAtHome;

        ContainerShip containerShip = createContainerShip();

        super.testCreateFreighter(containerShip , name, launchDate,deadWeightTonnage,status);

        assertEquals(containerCount, containerShip.getContainerCount());

    }

    public void testChangeName() {
        ContainerShip containerShip = createContainerShip();
        final String newName = "Ocean Hope";

        super.testChangeName(containerShip, newName);

    }

    public void testChangesStatus() {

        ContainerShip ship = createContainerShip();

        super.testChangeStatus(ship);




    }

    public void testChangeCargoDescription() {


        ContainerShip ship = createContainerShip();

        super.testChangeCargoDescriptionWhileDockedAtHome(ship,cargoDescription);


    }

    public void testChangeCargoDescriptionFailOnVoyage() {


        ContainerShip ship = createContainerShip();

        super.testChangeCargoDescriptionFailOnVoyage(ship,cargoDescription,cargoDescriptionEmpty);



    }

    public void testChangeCargoDescriptionDockedAway() {

        ContainerShip ship = createContainerShip();

        super.testChangeCargoDescriptionDockedAway(ship,cargoDescription,cargoDescriptionEmpty);


    }

    public void testFullReport() {

        ContainerShip ship = createContainerShip();

        final String output = "Name: " + ship.getName() + ", Launch Date: " + ship.getLaunchDate() +
                ", Dead Weight Tonnage: " + ship.getDeadWeightTonnage() + ", Container Count: " +
                ship.getContainerCount() + ", Status: " + ship.getStatus() + ", Cargo: " + ship.getCargoDescription() +
                ".";

        super.testFullReport(ship, output);




    }


    public ContainerShip createContainerShip() {
        final String name = "Hansa Carrier";
        final LocalDate lauchDate = LocalDate.of(1989, 2, 1);
        final int deadWeightTonnage = 26366;
        final int containerCount = 0;
        final Status status = Status.DockedAtHome;
        final String cargoDescription = "Empty";


        ContainerShip containerShip = new ContainerShip(name, lauchDate, deadWeightTonnage, cargoDescription, containerCount, status);

        return containerShip;
    }

}
