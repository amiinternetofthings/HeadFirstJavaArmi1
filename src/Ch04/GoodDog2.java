package Ch04;

public class GoodDog2 extends GoodDog {
    private String name;
    private String breed;

    public void setName(String dogname) {
        name = dogname;
    }

    public void setBreed(String dogbreed) {
        breed = dogbreed;
    }
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}

