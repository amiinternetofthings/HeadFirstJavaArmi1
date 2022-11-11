package CH10;

public class Foof {
    final int size =3;
    final int whuffle;

    Foof(){
        whuffle = 42;
    }

    void doStuff(final int x) {


    }

    void doMore() {
        final int x = 7;
    }
}

//class FoofTest {
//    public static void main (String[] args) {
//        Foof foof = new Foof();
//
//
//    }
//}
//
//class Foo {
//    static int x;
//
//    public void go(){
//        System.out.println(x);
//    }
//}
//
//class Foo2 {
//    int x;
//
//    public static void go(){
//
//        System.out.println(x);
//    }
//}
//
//class Foo3 {
//    final int x;
//
//    public void go(){
//        System.out.println(x);
//    }
//}
//
//class Foo4 {
//    static final int x = 12;
//    public void go() {
//        System.out.println(x);
//    }
//}
//
//class Foo5 {
//    static final int x = 12;
//    public static void go (final int x) {
//        System.out.println(x);
//    }
//
//    public static void main (String[] args) {
//        Foo5 foo5 = new Foo5();
//        Foo5.go(1);
//        System.out.println(x);
//    }
//
//}
//
//class Foo6 {
//    int x = 12;
//
//    public static void go (final int x) {
//        System.out.println(x);
//    }
//}
//
//