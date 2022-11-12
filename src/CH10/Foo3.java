package CH10;

public class Foo3 {
    //This is Foo3 of Chapter-10
    final int x = 200; //TODO : can remove 200 just to declare value on x variable
    static final int y = 100; //TODO : extra line

    public void go() {
        System.out.println(x);
    }
    //TODO : added main to test

    public static void main (String[] args) {
        System.out.println(Foo3.y);
    }
}
