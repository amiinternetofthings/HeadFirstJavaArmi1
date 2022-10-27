package amireading;

public abstract class Meter {
    private int meterCount;
    private String meterNumber;

    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }

    public void setMeterCount(int meterCount) {
        this.meterCount = meterCount;
    }

    public int getMeterCount() {
        return meterCount;
    }

    public String getMeterNumber() {
        return meterNumber;
    }
}

class ElectricMeter extends Meter {

}
class WaterMeter extends Meter {

}

class Read {
    public void startRead(Meter a) {

        int result = a.getMeterCount();
        String aname = a.getMeterNumber();


        if (a.getClass().equals(ElectricMeter.class)) {
            System.out.println(aname+  " Electric Reads: " + result);
        }else {
            System.out.println(aname+ " Water Reads: " + result);
        }
    }
}

class ReadDrive {
    public void startReadTestDrive () {
        Read newRead = new Read();
        ElectricMeter electricMeter = new ElectricMeter();
        WaterMeter waterMeter = new WaterMeter();

        electricMeter.setMeterNumber("E123");
        electricMeter.setMeterCount(7777);
        waterMeter.setMeterNumber("W12333423");
        waterMeter.setMeterCount(66666);

        newRead.startRead(electricMeter);
        newRead.startRead(waterMeter);

    }

}

class ReadTestDrive {
    public static void main (String[] args) {
        ReadDrive readDrive = new ReadDrive();
        readDrive.startReadTestDrive();

    }
}