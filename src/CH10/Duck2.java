package CH10;

public class Duck2 {

    private int anyNumber;
    private static int duckCount = 0;
    public static void main(String[] args) {
        Duck2 duck2 = new Duck2();
        duck2.setAnyNumber(2);
        Duck2 duck21 = new Duck2();
        Duck2 duck22 = new Duck2();
        System.out.println(duck2.getAnyNumber());
    }

    public void setAnyNumber(int anyNumber) {
        this.anyNumber = anyNumber;
    }

    public int getAnyNumber() {
        return anyNumber;
    }

    public Duck2() {
        duckCount++;
        System.out.println("Duck count is " +duckCount);
    }
}
