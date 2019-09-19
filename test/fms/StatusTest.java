package fms;

import junit.framework.TestCase;

public class StatusTest extends TestCase {

    public void testCreateStatus(){

        Setup setup = Setup.DockedAtHome;

        assertEquals(Setup.DockedAtHome,setup);
    }
}
