package ArmiClasses;

public class Main {
    int xb;
    int xc;
    public Main(int x, int z) {
        this.xb = x;
        this.xc = z;
    }

    public static void main(String[] args){
        int a = 200;
        int b = 300;
        Main myObj = new Main(a, b);
        Main myObj2 = new Main(a+100, b+100);
        System.out.println(myObj.xb +" " + myObj.xc);
        System.out.println(myObj2.xb + " " + myObj2.xc);
    }
}
