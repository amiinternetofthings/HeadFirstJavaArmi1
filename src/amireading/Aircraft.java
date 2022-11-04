package amireading;

interface Aircraft {
    void flyAircraft();
}

class Airplane extends Vehicle implements Aircraft{
    private String engines;


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

    @Override
     public void flyAircraft() {
        System.out.println("\"Fly Aircraft\"");
    }
}

class TestAirplane {
    public static void main (String[] args) {
        Airplane airplane = new Airplane();
        airplane.setBrand("Airbus");
        airplane.setNumberOfDoors(100);
        airplane.setEngineType("General Electric");
        airplane.doSomething();
        airplane.flyAircraft();
    }

}
