package CH06;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CheckArrayList {
    public static void main(String [] args) {
        ArrayList<Listing> myList = new ArrayList<Listing>();
        Listing a = new Listing();
        myList.add(a);
        a.setName("Armi");
        a.setAge(100);
        Listing b = new Listing();;
        myList.add(b);
        b.setName("John");
        b.setAge(300);

        //myList.remove(a);
        for (Listing z : myList) {
            System.out.println(z.getName() + " " + z.getAge());
        }

    }
}
class Listing {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}