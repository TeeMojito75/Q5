package junit.com;

import org.junit.*;
import static org.junit.Assert.*;

public class TestRevisedState {
    private Revised rv;

    @Test
    public void CorrectCreation() {
        rv = new Revised();
        assertEquals("Today", rv.getInfoState());
    }
}
