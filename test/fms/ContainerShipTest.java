package fms;

import junit.framework.TestCase;

import java.time.LocalDate;

public class ContainerShipTest extends TestCase {

    public void testCreateContainerShip(){

        final String name = "Marco Polo";
        final LocalDate lauchDate = LocalDate.of(2012,11,2);
        final int deadWeightTonnage = 187625;
        final int containerCount = 0;
        final Status status = Status.DockedAtHome;

        ContainerShip containerShip = new ContainerShip(name);

        assertEquals(name, containerShip.getName());
        assertEquals(deadWeightTonnage, containerShip.getDeadWeightTonnage());
        assertEquals(containerCount, containerShip.getContainerCount());
        assertEquals(status, containerShip.getStatus());

    }
}
