package CH10;

public class Bar {
    int x = Math.abs(-600);
    double d = Math.abs(233.43);

    float c = (float) d;

    int e = Math.round(c);
    public static final int BAR_X;

    static {
        BAR_X = (int) (Math.random() * 100);
    }
    public static void main (String[] args) {
        Bar bar = new Bar();
        System.out.println(Bar.BAR_X+ " " + bar.x +" " +bar.d +" "+ bar.e);
    }

    int i = 288;
    Integer iWrap = Integer.valueOf(i);

    int unWrapped = iWrap.intValue();


}

