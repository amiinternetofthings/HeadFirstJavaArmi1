package CH10;

import java.util.ArrayList;

public class DoNumsNew {

    int y = 10000;
    Integer myInteger = Integer.valueOf(y);

    public static void doNumsNewWay () {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10);
        listOfNumbers.add(20);
         for (Integer x : listOfNumbers) {
             System.out.println("Numbers : " + x);
         }
    }

    public static void main (String[] args) {
        DoNumsNew doNumsNew = new DoNumsNew();
        doNumsNew.takeNumber(doNumsNew.myInteger);

    }

    public void takeNumber (Integer i) {
        System.out.println(i);

    }
}
