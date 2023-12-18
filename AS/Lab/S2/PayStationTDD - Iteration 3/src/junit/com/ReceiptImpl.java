package junit.com;

public class ReceiptImpl implements Receipt {
    private int storedValue;
    public ReceiptImpl(int display) {
        storedValue = display;
    }
    @Override
    public int value() {
        return storedValue;
    }

}
