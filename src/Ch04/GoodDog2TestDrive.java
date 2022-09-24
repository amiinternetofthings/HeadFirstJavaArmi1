package Ch04;

public class GoodDog2TestDrive {
    public static void main(String[] args) {
        //int bsize =
        GoodDog2 brownie = new GoodDog2();
        brownie.setName("Brownie");
        brownie.setSize((int) (Math.random() * 200));
        brownie.setBreed("Askal");

        System.out.println("Dog name is " + brownie.getName() + brownie.getSize() + brownie.getBreed());
        brownie.bark();

    }
}
