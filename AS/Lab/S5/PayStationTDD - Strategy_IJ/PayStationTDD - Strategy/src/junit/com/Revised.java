package junit.com;

public class Revised extends Estado{
    private String date;

    public Revised() {
        date = "Today";
    }
    @Override
    public String getInfoState() {
        return date;
    }


}
