package fms;

import junit.framework.TestCase;

import java.time.LocalDate;


public class TankerTest extends TestCase {

    public void testCreateTanker(){

        final String name = "Seawise Giant";
        final LocalDate launchDate = LocalDate.of(1979,12,4);
        final int dwt = 564763;
        final int tonnageVolume = 0;

        Tanker tanker = new Tanker(name,launchDate,dwt);

        assertEquals(name, tanker.getName());
        assertEquals(launchDate, tanker.getLaunchDate());
        assertEquals(dwt, tanker.getDeadWeightTonnage());
        assertEquals(tonnageVolume, tanker.getTonnageVolume());
        assertEquals(Status.DockedAtHome, tanker.getStatus());



    }
}
