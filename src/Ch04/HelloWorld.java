package Ch04;

public class HelloWorld {
    public static void main(String[] args) {
        int skye = 100;
        int daddy = 500;
        int c = skye;
        int result = 0;
        HelloWorld obs = new HelloWorld();
        result = obs.addAll(skye, daddy);
        System.out.println(result);

        }
    public int addAll(int a, int b) {
        int sumall;
        sumall = a + b;
        return  sumall;

    }
}
