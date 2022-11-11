package CH10;

public class Bar {
    public static final int BAR_X;

    static {
        BAR_X = (int) (Math.random() * 100);
    }
    public static void main (String[] args) {
        System.out.println(Bar.BAR_X);
    }

}

