package ArmiClasses;

public class SomethingMath {
    public static void someToAdd(int a, int b) {
        int c = a + b;
        int d = c * 100;
        System.out.println("Result is " + d);
    }
}

class SomthingMathTest {
    public static void  main (String[] args) {
        SomethingMath.someToAdd(100, 300);
    }
}