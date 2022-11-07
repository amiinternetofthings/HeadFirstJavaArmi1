package CH09A;

public abstract class Bird {
    private int size;

    public Bird() {

        size = 27;
        System.out.println(size);
    }

    public Bird(int birdSize) {
        size = birdSize;
        System.out.println(size);
    }

    public int getSize() {
        return size;
    }

}

class Duck3 extends Bird{

    public Duck3(){

        super();

    }

    public Duck3(int duck3Size) {

        super(duck3Size);

    }

}

interface PetBird{
    public void sayTwit();
}

class Maya extends Bird implements PetBird {
    @Override
    public void sayTwit() {
        System.out.println("Maya say's tweet tweet");
    }

    public Maya(){
        super();
    }

    public Maya(int mayaSize){
        super(mayaSize);
    }
}

class Duck3Test {
    public static void main(String[] args){
        Duck3 duck3 = new Duck3(999);
        Duck3 anotherDuck = new Duck3();

        Maya maya = new Maya(1234);
        maya.sayTwit();
        System.out.println(maya.getClass().toString() + " " +maya.getSize());
    }

}