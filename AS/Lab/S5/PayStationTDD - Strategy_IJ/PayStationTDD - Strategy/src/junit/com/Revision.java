package junit.com;

public class Revision extends Estado{
    private String state;

    public Revision() {
        state = "John";
    }
    @Override
    public String getInfoState() {
        return state;
    }
}
