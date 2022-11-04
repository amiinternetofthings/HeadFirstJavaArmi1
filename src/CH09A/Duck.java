package CH09A;

public class Duck {

    int size;
    private String name;
    public Duck(int duckSize) {

        System.out.println("Quack");
        size = duckSize;
        System.out.println("size is " + size +" " +name);
    }

    public void setName(String duckName) {

        name = duckName;
    }

}

class UseADuck{
    public static void main (String[] args) {

        Duck d = new Duck(42);
        d.setName("DoooooDuck");
    }
}
