package CH08;

public abstract class Animals {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

abstract class Canine extends Animals {

    public abstract void myOwnPrint();

}

class Dog extends Canine {
    @Override
    public void myOwnPrint() {
        System.out.println(getName());
    }
}

class MyDogList {
    private Dog [] dogs = new Dog[2];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] =d;
            String xname = d.getName();
            System.out.println("Dog added at " + nextIndex + " " +xname);
            nextIndex++;
        }
    }
}

class MyDogListTestDrive{
    public static void  main (String[] args) {
        MyDogList myDogList = new MyDogList();
        Dog brownie = new Dog();
        brownie.setName("Brownie");
        myDogList.add(brownie);
        Dog whitie = new Dog();
        whitie.setName("Whitie");
        myDogList.add(whitie);
    }
}