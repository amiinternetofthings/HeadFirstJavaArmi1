package amireading;

public abstract class Vehicle {
    private String brand;
    private int numberOfDoors;

    public void setBrand (String stringBrand){
        brand = stringBrand;
    }

    public void setNumberOfDoors(int doors){
        numberOfDoors = doors;
    }
    public String getBrand(){
        return brand;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public abstract void doSomething();
}

class Sedan extends Vehicle {
    @Override
    public void doSomething() {
        String gb = getBrand();
        int gDorrs = getNumberOfDoors();
        System.out.println("This is a sedan:  " + gb +",   Number of doors: " + gDorrs);
    }
}

class InjectSome {
    public void injecting(Vehicle v) {
        v.doSomething();
    }
}
class VehicleTest {
    public static void main(String[] args)  {
        Sedan sedan = new Sedan();
        sedan.setBrand("Nissan");
        sedan.setNumberOfDoors(4);
        InjectSome injectSome = new InjectSome();
        injectSome.injecting(sedan);
    }
}
