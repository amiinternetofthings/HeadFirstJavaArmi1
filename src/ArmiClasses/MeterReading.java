package ArmiClasses;

public class MeterReading {
    private String unit;
    private double reading;

    public void setUnit(String unitNo) {
        unit = unitNo;
    }
    public void setReading(double rd) {
        reading = rd;
    }

    public String getUnit() {
        return unit;
    }

    public double getReading() {
        return reading;
    }

}

class MeterReadingTestDrive{
    public static void main(String[] args) {
        MeterReading rm201 = new MeterReading();
        rm201.setUnit("201");
        rm201.setReading(22.223);
        String arm = rm201.getUnit();
        double ard = rm201.getReading();
        System.out.println(arm + " " + ard);

    }
}