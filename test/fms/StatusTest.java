package fms;

import junit.framework.TestCase;

public class StatusTest extends TestCase {

    public void testCreateStatus(){

        int i = 0;
        for(Status status: Status.values()){
            assertEquals(Status.values()[i],status);
            i++;
        }

    }
}
