package CH09A;

public abstract class Pen {
    String name;
    int points;
    public Pen(String penName, int numberOfPoints) {
        name = penName;
        points = 200 + numberOfPoints;
    }

    public void doSomething() {
        System.out.println("The Name is " +name + " and number of points " + points);
    }
}

class Ballpen extends Pen {


    public Ballpen(String penName, int numberOfPoints) {
        super(penName, numberOfPoints);
    }
}

class Pencil extends Pen {
    public Pencil(String penName, int numbeOfPoints) {
        super(penName, numbeOfPoints);
    }
}

class TestPen {
    public static void main (String[] args) {
        Ballpen ballpen = new Ballpen("Bic", 50);
        Pencil pencil = new Pencil("Mongol", 100);
        ballpen.doSomething();
        pencil.doSomething();
    }

}