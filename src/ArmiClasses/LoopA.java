package ArmiClasses;

public class LoopA {
    public static void main(String[] args){
        int x;
        for (x=0; x<9; x++) {
            for (int b=1; b<=x; b++) {
                System.out.print(b +" ");
            }
            System.out.println("");
        }
    }
}
