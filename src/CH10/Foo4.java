package CH10;

public class Foo4 {
    static final int x = 12; //TODO : initialized  12 to variable x as it is final

    public void go () {
        System.out.println(x);

    }

    public static void main (String[] args) {
        System.out.println(Foo4.x);
        Foo4 foo4 = new Foo4();
        foo4.go();
    }
}
