package Ch04;

public class GoodDog {
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof woof");
        } else if (size > 14) {
            System.out.println("Ruff ruff");
        } else {
            System.out.println("Yip yip");
        }
    }
}

class GoodDogTestDrive {
    public static void  main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());

        one.bark();
        two.bark();
    }
}