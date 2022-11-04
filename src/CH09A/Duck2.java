package CH09A;

public class Duck2 {
    int size;
    public Duck2(){
        size = 27;
    }

    public Duck2(int duckSize) {
        size = duckSize;
    }

    public int getSize() {
        return size;
    }
}

class Duck2Test {
    public static void main (String[] args){
        Duck2 d2 = new Duck2(200);
        int gsize = d2.getSize() + 100;
        System.out.println(gsize);
    }


}