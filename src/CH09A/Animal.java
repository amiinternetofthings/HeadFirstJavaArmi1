package CH09A;

public abstract class Animal {
    private final String name;

    public String getName() {
        return name;
    }

    public Animal(String theName){
        name = theName;
    }

}

class Hippo extends Animal {
    public Hippo(String name) {
        super(name);
    }
}

interface SwampAnimal {
    public void doSwampThing();

}

class Snake extends Hippo implements SwampAnimal {
    @Override
    public void doSwampThing() {
        System.out.println("Swamp things Slither");
    }

    public Snake(String snakeName) {
        super(snakeName);
    }
}

class MakeHippo {
    public static void main (String[] args) {
        Hippo h = new Hippo("Buffy");
        System.out.println(h.getName());

        Snake snake = new Snake("Snakey");
        System.out.println(snake.getName());
        snake.doSwampThing();
    }
}