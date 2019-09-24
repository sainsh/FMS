package fms;

import junit.framework.TestCase;

public class FleetTest extends TestCase {

    public void testCreateFleetFakeIt(){

        Fleet fleet = new Fleet();
        int totalDWT = 0;

        for (Freighter ship:
             fleet.getFreighters()) {
            totalDWT += ship.getDeadWeightTonnage();

        }

        assertEquals(0,fleet.getFreighters().size());
        assertEquals(0, totalDWT);
    }


}
