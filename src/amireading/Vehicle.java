package amireading;

public abstract class Vehicle {
    private String brand;
    private int sNumber;

    public abstract void setBrand(String stringBrand);
    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public abstract String getBrand();
    public  int getsNumber(){
        return sNumber;
    }
}

class Sedan extends Vehicle {
    String brand;
    @Override
    public void setBrand(String stringBrand){
        brand = stringBrand;

    }

    @Override
    public String getBrand() {
        return brand;
    }



}

class VehicleTest {
    public static void main(String[] args)  {
        Sedan sedan = new Sedan();
        sedan.setBrand("Nissan");
        sedan.setsNumber(7777);
        String brandName = sedan.getBrand();
        int serialNumber = sedan.getsNumber();

        System.out.println("Brand Name is: " +brandName +"   -   " + "Serial Number is: " +serialNumber);
    }
}

