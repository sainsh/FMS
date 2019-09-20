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

        Tanker tanker = new Tanker(name,launchDate,dwt,tonnageVolume,status);

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

        Tanker tanker = new Tanker(name, launchDate,dwt,tonnageVolume,status);

        assertEquals(name, tanker.getName());
        assertEquals(launchDate, tanker.getLaunchDate());
        assertEquals(dwt, tanker.getDeadWeightTonnage());
        assertEquals(tonnageVolume, tanker.getTonnageVolume());
        assertEquals(status, tanker.getStatus());


    }
}
