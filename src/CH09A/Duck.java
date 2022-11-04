package CH09A;

public class Duck {
    public Duck() {
        System.out.println("Quack");
    }
}

class UseADuck{
    public static void main (String[] args) {
        Duck d = new Duck();
    }
}
