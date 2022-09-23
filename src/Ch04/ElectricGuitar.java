package Ch04;

import static java.lang.Boolean.TRUE;

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

    void setRockStartUseIt(boolean YesorNo) {
        rockStartUseIt = YesorNo;
    }
}

class ElectricGuitarTestDrive {
    public static void main(String[] args) {
        ElectricGuitar eg = new ElectricGuitar();
        eg.setBrand("Gibson");
        eg.setNumOfPickUps(2);
        eg.setRockStartUseIt(TRUE);
                System.out.println("The Brand is " + eg.getBrand());
        System.out.println("The number of pickups is " + eg.getNumOfPickUps());
        System.out.println("Rockstar use it  " + eg.getRockStarUseIt());

        ElectricGuitar eg2 = new ElectricGuitar();
        eg2.setBrand("Yamaha");
        eg2.setNumOfPickUps(10);
        eg2.setRockStartUseIt(TRUE);
        System.out.println("The Brand is " + eg2.getBrand());
        System.out.println("The number of pickups is " + eg2.getNumOfPickUps());
    }
}