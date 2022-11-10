package CH10;



public class Duck2 {

    private int anyNumber;
    private static int duckCount = 0;
    private String name;
    public static void main(String[] args) {
        Duck2 duck2 = new Duck2();
        duck2.setName("Bob");
        duck2.setAnyNumber(2);
        Duck2 duck21 = new Duck2();
        duck21.setName("Billy");
        Duck2 duck22 = new Duck2();
        duck22.setName("John");
        Duck2 duck23 = new Duck2();
        duck23.setName("Mathew");
        double duckPower = Math.pow(23, 2);
        System.out.println(duck2.getAnyNumber());
        System.out.println(duckPower);
    }

    public void setAnyNumber(int anyNumber) {
        this.anyNumber = anyNumber;
    }

    public int getAnyNumber() {
        return anyNumber;
    }

    public void setName(String duckName){
        this.name = duckName;
    }

    public Duck2() {
        duckCount++;
        System.out.println("Duck count is " + Duck2.duckCount);
    }


}
