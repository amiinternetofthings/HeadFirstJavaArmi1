package CH08;

public class MyAnimalList {
    private Animals[] animals = new Animals[2];
    private int nextIndex = 0;

    public void add(Animals a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at " + nextIndex + " " +a.getName());
            nextIndex++;
        }
    }
}

class AnimalTestDrive{
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        a.setName("Blackie");
        c.setName("Lazzie");
        list.add(a);
        list.add(c);

    }
}