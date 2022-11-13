package CH09A.ElectronicDevice;

public abstract class ElectronicDevices {
    private String name;
    private int serialNumber;
    public void setName(String stringName){
        this.name = stringName;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName(){
        return name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}

abstract class Radio extends ElectronicDevices {

    private String radioType;

    public void setRadioType(String radioType) {
        this.radioType = radioType;
    }

    public String getRadioType() {
        return radioType;
    }

    public abstract void doSomething();

}

class ComRadio extends Radio {


    @Override
    public void doSomething() {
        System.out.println(getName() + " " + getSerialNumber() +" "+getRadioType());
    }
}

class RadioTest {
    public static void main (String[] args) {
        ComRadio comRadio = new ComRadio();
        comRadio.setName("Yaesu");
        comRadio.setRadioType("2-Meter");
        comRadio.setSerialNumber(1234);

        comRadio.doSomething();
    }
}
