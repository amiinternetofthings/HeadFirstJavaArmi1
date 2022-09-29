package Ch04;

import java.nio.channels.SelectionKey;

public class HelloWorld {
    private int skye;
    private int daddy;

    public void setSkye(int b) {
        skye = b;
    }
    public void setDaddy(int a) {
        daddy = a;
    }
    public int addAll() {
        return skye + daddy;
    }
    public static void main(String[] args) {
        int x = 100;
        int y = 0;
        HelloWorld [] obs = new HelloWorld[x];
        while (y < x) {
            obs[y] = new HelloWorld();
            obs[y].setSkye(y + 20);
            obs[y].setDaddy(y + 3);
            System.out.println(obs[y].addAll());
            y = y + 1;
        }


    }

}
