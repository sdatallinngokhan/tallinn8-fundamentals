package week3.staticPack;

public class StaticExample {

    public static double sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        // no need for instance of class. because sum method is static
        StaticExample staticExample = new StaticExample();

        int x = 6;
        int y = 3;

        double result = sum(x, y);

        System.out.println(result);
    }
}
