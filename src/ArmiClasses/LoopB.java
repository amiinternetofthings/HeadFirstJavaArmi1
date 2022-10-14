package ArmiClasses;

public class LoopB {
    public static void main(String[] args){
        int x;
        for (x=0; x<4; x++) {
            for (int b=1; b<=x; b++) {
                System.out.print(b +" ");
            }
            System.out.println("");
        }
        int z;
        for (z = x; z > 0 ; z-- ) {
            for (int d = 1; d <= z; d++) {
                System.out.print(d + " ");
            }
            System.out.println("");
        }
    }
}
