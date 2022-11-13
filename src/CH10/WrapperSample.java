package CH10;

import java.util.ArrayList;

public class WrapperSample {
    static int i = 1;;
    Integer b = i;

    public WrapperSample(){
        i++;
    }

    public int  printVar() {
        return b;
    }

    public static void main (String[] args) {
        ArrayList<WrapperSample> myList = new ArrayList<>();

        WrapperSample wrapperSample1 = new WrapperSample();
        myList.add(wrapperSample1);
        WrapperSample wrapperSample2 = new WrapperSample();
        myList.add(wrapperSample2);
        WrapperSample wrapperSample3 = new WrapperSample();
        myList.add(wrapperSample3);


        for (WrapperSample p : myList) {
            System.out.println(p.printVar());
        }
    }
}
