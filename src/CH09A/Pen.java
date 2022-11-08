package CH09A;

public abstract class Pen {
    String name;
    int points;
    public Pen(){
        name = "'Any Default Name'";
    }
    public Pen(String penName, int numberOfPoints) {
        name = penName;
        points = 200 + numberOfPoints;
    }

    public void doSomething() {

        System.out.println("The Name is " +name + " and number of points " + points);
    }

}

class Ballpen extends Pen {

    public Ballpen(){
        super();
    }


    public Ballpen(String penName, int numberOfPoints) {

        super(penName, numberOfPoints);
    }

}

class Pencil extends Pen {

    public Pencil(){
        super();
    }
    public Pencil(String penName, int numbeOfPoints) {

        super(penName, numbeOfPoints);
    }
}

class TestPen {
    public static void main (String[] args) {
        Ballpen ballpen = new Ballpen("Bic", 50);
        ballpen.doSomething();
        Pencil pencil = new Pencil("Mongol", 100);
        pencil.doSomething();
        Ballpen ballpen1 = new Ballpen();
        ballpen1.doSomething();
        Pencil pencil1 = new Pencil();
        pencil1.doSomething();
    }

}