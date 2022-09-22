package Ch04;

public class ElectricGuitar{
    String brand;
    int numOfPickUps;
    boolean rockStartUseIt;

    String getBrand() {
        return brand;
    }
    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNumOfPickUps() {
        return numOfPickUps;
    }

    void setNumOfPickUps(int num) {
        numOfPickUps = num;
    }

    boolean getRockStarUseIt() {
        return rockStartUseIt;
    }

    void setRockStartUseIt(boolean yesorNo) {
        rockStartUseIt = yesorNo;
    }
}

class ElectricGuitarTestDrive {
    public static void main(String[] args) {
        ElectricGuitar eg = new ElectricGuitar();
        eg.setBrand("Gibson");
        eg.setNumOfPickUps(2);
        System.out.println("The Brand is " + eg.getBrand());
        System.out.println("The number of pickups is " + eg.numOfPickUps);

        ElectricGuitar eg2 = new ElectricGuitar();
        eg2.setBrand("Yamaha");
        eg2.setNumOfPickUps(10);

        int picks = eg2.getNumOfPickUps();
        System.out.println("The Brand is " + eg2.brand);
        System.out.println("The number of pickups is " + picks);
    }
}