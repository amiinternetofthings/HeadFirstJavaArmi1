package amireading;

public interface Aircraft {
    public abstract void setEngineType(String eng);

}

class Airplane extends Vehicle implements Aircraft{
    String engines;

    @Override
    public void setEngineType(String eng) {
        engines = eng;
    }

    @Override
    public void doSomething() {
        String gEngine = engines;
        String gBrand = getBrand();
        int gDoors = getNumberOfDoors();
        System.out.println(gEngine + " " +gBrand +" Number of doors: " + gDoors);
    }
}

class TestAirplane {
    public static void main (String[] args) {
        Airplane airplane = new Airplane();
        airplane.setBrand("Airbus");
        airplane.setNumberOfDoors(100);
        airplane.setEngineType("General Electric");
        airplane.doSomething();
    }

}
