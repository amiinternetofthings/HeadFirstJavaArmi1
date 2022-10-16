package ArmiClasses;

import java.util.ArrayList;

public class CarsArray {
    public static void main (String[] args) {
        ArrayList<MyItems> cars = new ArrayList<MyItems>();
        MyItems a = new MyItems();
        a.name = "Toyota";
        cars.add(a);
        MyItems b = new MyItems();
        b.name = "Nissan";
        cars.add(b);
        MyItems c = new MyItems();
        c.name = "Mitsubishi";
        cars.add(c);

        for (MyItems s : cars) {
            System.out.println(s.name + "-" + s.isbn);
        }
    }
}

class MyItems {
    String name;
    String isbn;

}