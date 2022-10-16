package ArmiClasses;

import java.util.Calendar;

public class MyDateClass {
    public static void main (String[] args) {
        Calendar myCal = Calendar.getInstance();
        System.out.println(myCal.get(Calendar.MONTH));
    }
}
