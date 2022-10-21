package amireading;

public abstract class Meter {
    private int meterCount;

    public void setMeterCount(int meterCount) {
        this.meterCount = meterCount;
    }

    public int getMeterCount(){
        return meterCount;
    }
}
