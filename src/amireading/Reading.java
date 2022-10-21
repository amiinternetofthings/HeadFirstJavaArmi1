package amireading;

public class Reading {
    public void start() {
        Read wmr = new Read();
        Meter wrm1 = new WaterMeter();
        wrm1.setMeterCount(1234);
        wmr.startRead(wrm1);
        Meter erm1 = new ElectricMeter();
        erm1.setMeterCount(6666);
        wmr.startRead(erm1);

    }
}

class ReadingTest {
    public static void main (String[] args) {
        Reading a = new Reading();
        a.start();
    }
}
