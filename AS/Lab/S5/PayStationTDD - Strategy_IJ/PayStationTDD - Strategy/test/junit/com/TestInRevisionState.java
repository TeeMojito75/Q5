package junit.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInRevisionState {
    private Revision rs;

    @Test
    public void CorrectCreation() {
        rs = new Revision();
        assertEquals("John", rs.getInfoState());
    }
}
