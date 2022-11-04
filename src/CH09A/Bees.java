package CH09A;

public class Bees {
    Honey [] beeHA;
}

class Honey {
    public static void main (String[] args) {
        Honey honeyPot = new Honey();
        Honey [] ha = {honeyPot, honeyPot, honeyPot, honeyPot };
        Bees b1 = new Bees();
        b1.beeHA = ha;
    }
}