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

class FoofTest {
    public static void main (String[] args) {
        Foof foof = new Foof();


    }
}
