package Ch04;

public class Clock {
    private String time;

    public void setTime(String t) {
        time = t;
    }

    public String getTime() {
        return time;
    }

    public static void main (String[] args){
        Clock c = new Clock();

        c.setTime("1200");
        String tod = c.getTime();
        System.out.println("time is " + tod);
    }
}
