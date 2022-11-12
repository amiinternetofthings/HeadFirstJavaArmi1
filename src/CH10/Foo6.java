package CH10;

import java.util.ArrayList;

public class Foo6 {
    int x = 12;
    public static void go(final int x) {
        System.out.println(x);
    }

    public static void main (String[] args) {
        ArrayList<Foo6> myList = new ArrayList<>();
        Foo6 foo6 = new Foo6();
        myList.add(foo6);
        foo6.go(5);
        System.out.println(foo6.x + " " + myList.get(0));
        Foo6.doNumsOldWay();
    }

    public static void doNumsOldWay() {
        ArrayList listOfNumbers = new ArrayList();
        listOfNumbers.add(Integer.valueOf(3));
        Integer one = (Integer) listOfNumbers.get(0);
        int intOne = one.intValue();
        System.out.println(intOne);



    }
}
